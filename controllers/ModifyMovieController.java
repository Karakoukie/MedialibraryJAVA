package controllers;

import entities.ActorPersonEntity;
import entities.ArticleStateEntity;
import entities.ArticleSupportEntity;
import entities.MovieArticleEntity;
import entities.MovieArticleTypeEntity;
import entities.MovieFormatEntity;
import entities.MovieTypeEntity;
import entities.PersonEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class ModifyMovieController {

    public static ArrayList<ArticleSupportEntity> getSupportsFields() {
        ArrayList<ArticleSupportEntity> supportList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM supports";

            ResultSet statement = DatabaseConnection.query(query, null, false);
            
            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("id_support");
                    String name = statement.getString("nom_support");

                    supportList.add(new ArticleSupportEntity(id, name));
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return supportList;
    }
    
    public static ArrayList<MovieFormatEntity> getFormatsFields() {
        ArrayList<MovieFormatEntity> formatList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM format_film";

            ResultSet statement = DatabaseConnection.query(query, null, false);
            
            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("id_format");
                    String name = statement.getString("nom_format");

                    formatList.add(new MovieFormatEntity(id, name));
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return formatList;
    }
    
    public static ArrayList<PersonEntity> getPersonFields() {
        ArrayList<PersonEntity> directorsList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM personnes";

            ResultSet statement = DatabaseConnection.query(query, null, false);
            
            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("person_id");
                    String name = statement.getString("person_name");

                    directorsList.add(new PersonEntity(id, name));
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return directorsList;
    }
    
    public static ArrayList<MovieTypeEntity> getGendersFields() {
        ArrayList<MovieTypeEntity> gendersList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM genres_f";

            ResultSet statement = DatabaseConnection.query(query, null, false);
            
            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("id_genre");
                    String name = statement.getString("nom_genre");

                    gendersList.add(new MovieTypeEntity(id, name));
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return gendersList;
    }
    
    public static void updateMovie(String title, float price, String stateName, int year,
            int stock, String supportName, String image, int duration,
            String formatName, String directorName, String[] genders, String[] actors) {

        ArticleSupportEntity support = ArticleSupportEntity.select("", supportName, 1).get(0);
        MovieFormatEntity format = MovieFormatEntity.select("", formatName, 1).get(0);
        PersonEntity director = PersonEntity.select("", directorName, 1).get(0);
        ArticleStateEntity state = ArticleStateEntity.select("", stateName, 1).get(0);

        MovieArticleEntity movie = new MovieArticleEntity(duration, format, director, 0, title, price, year, stock, image, state, support);
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