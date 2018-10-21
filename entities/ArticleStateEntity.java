package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class ArticleStateEntity {

    private int article_state_id;
    private String article_state_name;

    public ArticleStateEntity(int article_state_id, String article_state_name) {
        this.article_state_id = article_state_id;
        this.article_state_name = article_state_name;
    }

    public int getArticle_state_id() {
        return article_state_id;
    }

    public void setArticle_state_id(int article_state_id) {
        this.article_state_id = article_state_id;
    }

    public String getArticle_state_name() {
        return article_state_name;
    }

    public void setArticle_state_name(String article_state_name) {
        this.article_state_name = article_state_name;
    }

    public static ArrayList<ArticleStateEntity> select(String article_state_id, String article_state_name, int resultNumber) {
        ArrayList<ArticleStateEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM articles_states ";
            query += "WHERE 1=1 ";
            
            if (!"".equals(article_state_id)) {
                query += "AND article_state_id=" + article_state_id + " ";
            }
            if (!"".equals(article_state_name)) {
                query += "AND article_state_name LIKE ('%" + article_state_name + "%') ";
            }
            
            query += "LIMIT " + Integer.toString(resultNumber);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("article_state_id");
                    String name = statement.getString("article_state_name");

                    ArticleStateEntity state = new ArticleStateEntity(id, name);
                    result.add(state);
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
            String query = "INSERT INTO articles_states (article_state_name) VALUES (?)";

            String[] fields = new String[1];
            fields[0] = this.article_state_name;

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        try {
            String query = "UPDATE articles_states SET article_state_name=? WHERE article_state_id=?";

            String[] fields = new String[2];
            fields[0] = this.article_state_name;
            fields[1] = Integer.toString(this.article_state_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
