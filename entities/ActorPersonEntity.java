package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class ActorPersonEntity {

    protected int actor_person_id;
    protected int movie_article_id;

    public ActorPersonEntity(int actor_person_id, int movie_article_id) {
        this.actor_person_id = actor_person_id;
        this.movie_article_id = movie_article_id;
    }

    public int getActor_person_id() {
        return actor_person_id;
    }

    public int getMovie_article_id() {
        return movie_article_id;
    }

    public static ArrayList<ActorPersonEntity> select(String actor_person_id, String movie_article_id, int resultNumber) {
        ArrayList<ActorPersonEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM actors_persons ";
            query += "WHERE 1=1 ";

            if (actor_person_id != "") {
                query += "AND actor_person_id=" + actor_person_id + " ";
            }
            if (movie_article_id != "") {
                query += "AND movie_article_id=" + movie_article_id + " ";
            }
            
            query += "LIMIT " + Integer.toString(resultNumber);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int actorID = statement.getInt("actor_person_id");
                    int movieID = statement.getInt("movie_article_id");

                    ActorPersonEntity actor = new ActorPersonEntity(actorID, movieID);
                    result.add(actor);
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
            String query = "INSERT INTO actors_persons (actor_person_id, movie_article_id) VALUES (?,?)";

            String[] fields = new String[2];
            fields[0] = Integer.toString(this.actor_person_id);
            fields[1] = Integer.toString(this.movie_article_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete() {
        try {
            String query = "DELETE FROM actors_persons WHERE actor_person_id=? AND movie_article_id=?";

            String[] fields = new String[2];
            fields[0] = Integer.toString(this.actor_person_id);
            fields[1] = Integer.toString(this.movie_article_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
