package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class MovieArticleEntity extends ArticleEntity {

    private int movie_article_duration;
    private MovieFormatEntity movie_article_format;
    private PersonEntity movie_article_director;

    public MovieArticleEntity(int movie_article_duration, 
            MovieFormatEntity movie_article_format, PersonEntity movie_article_director, 
            int article_id, String article_title, float article_price, 
            int article_year, int article_stock, String article_image, 
            ArticleStateEntity article_state, ArticleSupportEntity article_support) {
        
        super(article_id, article_title, article_price, article_year, article_stock, article_image, article_state, article_support);
        this.movie_article_duration = movie_article_duration;
        this.movie_article_format = movie_article_format;
        this.movie_article_director = movie_article_director;
    }

    public int getMovie_article_duration() {
        return movie_article_duration;
    }

    public MovieFormatEntity getMovie_article_format() {
        return movie_article_format;
    }

    public PersonEntity getMovie_article_director() {
        return movie_article_director;
    }

    public static ArrayList<ArticleEntity> select(String article_id, String title, int resultNumber) {
        ArrayList<ArticleEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM articles ";
            query += "JOIN movies_articles ON movies_articles.movie_article_id=articles.article_id ";
            query += "WHERE 1=1 ";

            if (!"".equals(article_id)) {
                query += "AND articles.article_id=" + article_id + " ";
            }
            if (!"".equals(title)) {
                query += "AND articles.article_title LIKE ('%" + title + "%') ";
            }

            query += "LIMIT " + Integer.toString(resultNumber);
            
            System.out.println(query);

            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int duration = statement.getInt("movie_article_duration");

                    int formatID = statement.getInt("movie_article_format_id");
                    MovieFormatEntity format = MovieFormatEntity.select(Integer.toString(formatID), "", 1).get(0);

                    int directorID = statement.getInt("movie_article_director_id");
                    PersonEntity director = PersonEntity.select(Integer.toString(directorID), "", 1).get(0);

                    int selectedID = statement.getInt("movie_article_id");
                    String selectedTitle = statement.getString("article_title");
                    float price = statement.getFloat("article_price");
                    int year = statement.getInt("article_year");
                    int stock = statement.getInt("article_stock");
                    String image = statement.getString("article_image");

                    int articleStateID = statement.getInt("article_state_id");
                    ArticleStateEntity state = ArticleStateEntity.select(Integer.toString(articleStateID), "", 1).get(0);

                    int supportID = statement.getInt("article_support_id");
                    ArticleSupportEntity support = ArticleSupportEntity.select(Integer.toString(supportID), "", 1).get(0);

                    MovieArticleEntity article = new MovieArticleEntity(duration, format, director, selectedID, selectedTitle, price, year, stock, image, state, support);
                    result.add(article);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    @Override
    public void insert() {
        super.insert();

        try {
            String query = "INSERT INTO movies_articles (movie_article_id, movie_article_duration, movie_article_format_id, movie_article_director_id) VALUES (?,?,?,?)";

            String[] fields = new String[4];
            fields[0] = Integer.toString(this.article_id);
            fields[1] = Float.toString(this.movie_article_duration);
            fields[2] = Integer.toString(this.movie_article_format.getMovie_format_id());
            fields[3] = Integer.toString(this.movie_article_director.getPerson_id());

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void update() {
        super.update();

        try {
            String query = "UPDATE movies_articles SET movie_article_duration=?, movie_article_format_id=?, movie_article_director_id=? WHERE movie_article_id=?";

            String[] fields = new String[4];
            fields[0] = Float.toString(this.movie_article_duration);
            fields[1] = Integer.toString(this.movie_article_format.getMovie_format_id());
            fields[2] = Integer.toString(this.movie_article_director.getPerson_id());
            fields[3] = Integer.toString(this.article_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
