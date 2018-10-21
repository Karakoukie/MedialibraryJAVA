package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class MovieTypeEntity {

    protected int movie_type_id;
    protected String movie_type_name;

    public MovieTypeEntity(int id, String name) {
        this.movie_type_id = id;
        this.movie_type_name = name;
    }

    public int getId() {
        return movie_type_id;
    }

    public String getName() {
        return movie_type_name;
    }
    
    public static ArrayList<MovieTypeEntity> select(String movie_type_id, String movie_type_name, int resultNumber) {
        ArrayList<MovieTypeEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM movies_types ";
            query += "WHERE 1=1 ";
            
            if (!"".equals(movie_type_id)) {
                query += "AND movie_type_id=" + movie_type_id + " ";
            }
            if (!"".equals(movie_type_name)) {
                query += "AND movie_type_name LIKE ('%" + movie_type_name + "%') ";
            }
            
            query += "LIMIT " + Integer.toString(resultNumber);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("movie_type_id");
                    String name = statement.getString("movie_type_name");

                    MovieTypeEntity article = new MovieTypeEntity(id, name);
                    result.add(article);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
    
    public boolean insert() {
        boolean result = false;
        
        try {
            String query = "INSERT INTO movies_types (movie_type_name) VALUES (?)";

            String[] fields = new String[1];
            fields[0] = this.movie_type_name;
            
            if (DatabaseConnection.query(query, fields, true) != null) {
                result = true;
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    
    public boolean update() {
        boolean result = false;
        
        try {
            String query = "UPDATE movies_types SET movie_type_name=? WHERE movie_type_id=?";

            String[] fields = new String[2];
            fields[0] = this.movie_type_name;
            fields[1] = Integer.toString(this.movie_type_id);
            
            if (DatabaseConnection.query(query, fields, true) != null) {
                result = true;
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    
}