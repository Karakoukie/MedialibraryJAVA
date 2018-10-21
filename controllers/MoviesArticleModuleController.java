package controllers;

import dialogs.articles.AddMovieDialog;
import dialogs.articles.ArticlesModuleDialog;
import dialogs.articles.ModifyMovieDialog;
import dialogs.articles.MoviesArticleModuleDialog;
import entities.ActorPersonEntity;
import entities.ArticleEntity;
import entities.ArticleStateEntity;
import entities.ArticleSupportEntity;
import entities.MovieArticleEntity;
import entities.MovieArticleTypeEntity;
import entities.MovieFormatEntity;
import entities.MovieTypeEntity;
import entities.PersonEntity;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MoviesArticleModuleController {

    private static int selectedMovieID;

    public static void previousDialog() {
        MoviesArticleModuleDialog.close();
        ArticlesModuleDialog.main(null);
    }

    public static void openAddMoviesDialog() {
        AddMovieDialog.main(null);
    }

    public static void openModifyMoviesDialog() {
        ModifyMovieDialog.main(null);
    }

    public static void displayMovies(String titleSearchFilter, int resultNumber, JTable moviesTable) {
        ArrayList<ArticleEntity> moviesList = MovieArticleEntity.select("", titleSearchFilter, resultNumber);

        DefaultTableModel model = (DefaultTableModel) moviesTable.getModel();
        model.setRowCount(0);

        for (int i = 0; i < moviesList.size(); i++) {
            if (moviesList.get(i) instanceof MovieArticleEntity) {
                MovieArticleEntity movie = (MovieArticleEntity) moviesList.get(i);
                
                Object[] rowData = new Object[11];
                rowData[0] = movie.getArticle_id();
                rowData[1] = movie.getArticle_title();
                rowData[2] = movie.getArticle_price();
                rowData[3] = movie.getArticle_state().getArticle_state_name();
                rowData[4] = movie.getArticle_year();
                rowData[5] = movie.getArticle_stock();
                rowData[6] = movie.getArticle_support().getArticle_support_name();
                rowData[7] = movie.getArticle_image();
                rowData[8] = movie.getMovie_article_duration();
                rowData[9] = movie.getMovie_article_format().getMovie_format_name();
                rowData[10] = movie.getMovie_article_director().getPerson_name();

                model.insertRow(i, rowData);
            }
        }

        model.fireTableDataChanged();
        moviesTable.setModel(model);
    }

    public static void setSelectedMovieID(int selectedID) {
        selectedMovieID = selectedID;
    }

    public static void modifySelectedMovie(String title, float price, String stateName, int year,
            int stock, String supportName, String image, int duration,
            String formatName, String directorName, String[] genders, String[] actors) {

        ArrayList<MovieArticleTypeEntity> typesToDelete = MovieArticleTypeEntity.select("", Integer.toString(selectedMovieID), Integer.MAX_VALUE);
        for (int i = 0; i < typesToDelete.size(); i++) {
            typesToDelete.get(i).delete();
        }

        ArrayList<ActorPersonEntity> actorsToDelete = ActorPersonEntity.select("", Integer.toString(selectedMovieID), Integer.MAX_VALUE);
        for (int i = 0; i < actorsToDelete.size(); i++) {
            actorsToDelete.get(i).delete();
        }

        ArticleSupportEntity support = ArticleSupportEntity.select("", supportName, 1).get(0);
        MovieFormatEntity format = MovieFormatEntity.select("", formatName, 1).get(0);
        PersonEntity director = PersonEntity.select("", directorName, 1).get(0);
        ArticleStateEntity state = ArticleStateEntity.select("", stateName, 1).get(0);

        MovieArticleEntity movie = new MovieArticleEntity(duration, format, director, selectedMovieID, title, price, year, stock, image, state, support);
        movie.update();

        for (String gender : genders) {
            MovieTypeEntity type = MovieTypeEntity.select("", gender, 1).get(0);
            MovieArticleTypeEntity articleType = new MovieArticleTypeEntity(type.getId(), movie.getArticle_id());
            articleType.insert();
        }

        for (String actor1 : actors) {
            PersonEntity person = PersonEntity.select("", actor1, 1).get(0);
            ActorPersonEntity actor = new ActorPersonEntity(person.getPerson_id(), movie.getArticle_id());
            actor.insert();
        }
    }

}
