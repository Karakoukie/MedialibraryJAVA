package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class MovieArticleTypeEntity {

    private int movie_type_id;
    private int movie_article_id;

    public MovieArticleTypeEntity(int movie_type_id, int movie_article_id) {
        this.movie_type_id = movie_type_id;
        this.movie_article_id = movie_article_id;
    }

    public static ArrayList<MovieArticleTypeEntity> select(String movie_type_id, String movie_article_id, int resultNumber) {
        ArrayList<MovieArticleTypeEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM movies_articles_types ";
            query += "WHERE 1=1 ";
            
            if (!"".equals(movie_type_id)) {
                query += "AND movie_type_id=" + movie_type_id + " ";
            }
            if (!"".equals(movie_article_id)) {
                query += "AND movie_article_id=" + movie_article_id + " ";
            }
            
            query += "LIMIT " + Integer.toString(resultNumber);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int typeID = statement.getInt("movie_type_id");
                    int movieID = statement.getInt("movie_article_id");

                    MovieArticleTypeEntity article = new MovieArticleTypeEntity(typeID, movieID);
                    result.add(article);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public void insert() {
        try {
            String query = "INSERT INTO movies_articles_types (movie_type_id, movie_article_id) VALUES (?,?)";

            String[] fields = new String[2];
            fields[0] = Integer.toString(this.movie_type_id);
            fields[1] = Integer.toString(this.movie_article_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete() {
        try {
            String query = "DELETE FROM movies_articles_types WHERE movie_type_id=? AND movie_article_id=?";

            String[] fields = new String[2];
            fields[0] = Integer.toString(this.movie_type_id);
            fields[1] = Integer.toString(this.movie_article_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
