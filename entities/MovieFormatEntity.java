package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class MovieFormatEntity {

    protected int movie_format_id;
    protected String movie_format_name;

    public MovieFormatEntity(int id, String name) {
        this.movie_format_id = id;
        this.movie_format_name = name;
    }

    public int getMovie_format_id() {
        return movie_format_id;
    }

    public String getMovie_format_name() {
        return movie_format_name;
    }

    public static ArrayList<MovieFormatEntity> select(String movie_format_id, String movie_format_name, int resultNumber) {
        ArrayList<MovieFormatEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM movies_formats ";
            query += "WHERE 1=1 ";
            
            if (!"".equals(movie_format_id)) {
                query += "AND movie_format_id=" + movie_format_id + " ";
            }
            if (!"".equals(movie_format_name)) {
                query += "AND movie_format_name LIKE ('%" + movie_format_name + "%') ";
            }
            
            query += "LIMIT " + Integer.toString(resultNumber);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("movie_format_id");
                    String name = statement.getString("movie_format_name");

                    MovieFormatEntity article = new MovieFormatEntity(id, name);
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
            String query = "INSERT INTO movies_formats (movie_format_name) VALUES (?)";

            String[] fields = new String[1];
            fields[0] = this.movie_format_name;

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete() {
        try {
            String query = "DELETE FROM movies_formats WHERE movie_format_id=?";

            String[] fields = new String[1];
            fields[0] = Integer.toString(this.movie_format_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update() {
        try {
            String query = "UPDATE movies_formats SET movie_format_name=? WHERE movie_format_id=?";

            String[] fields = new String[2];
            fields[0] = this.movie_format_name;
            fields[1] = Integer.toString(this.movie_format_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
