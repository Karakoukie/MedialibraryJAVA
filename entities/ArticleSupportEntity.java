package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class ArticleSupportEntity {

    private int article_support_id;
    private String article_support_name;

    public ArticleSupportEntity(int id, String name) {
        this.article_support_id = id;
        this.article_support_name = name;
    }

    public int getArticle_support_id() {
        return this.article_support_id;
    }

    public String getArticle_support_name() {
        return article_support_name;
    }

    public static ArrayList<ArticleSupportEntity> select(String article_support_id, String article_support_name, int resultNumber) {
        ArrayList<ArticleSupportEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM articles_supports ";
            query += "WHERE 1=1 ";
            
            if (!"".equals(article_support_id)) {
                query += "AND article_support_id=" + article_support_id + " ";
            }
            if (!"".equals(article_support_name)) {
                query += "AND article_support_name LIKE ('%" + article_support_name + "%') "; 
            }
            
            query += "LIMIT " + Integer.toString(resultNumber);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("article_support_id");
                    String name = statement.getString("article_support_name");

                    ArticleSupportEntity support = new ArticleSupportEntity(id, name);
                    result.add(support);
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
            String query = "INSERT INTO articles_supports (article_support_name) VALUES (?)";

            String[] fields = new String[1];
            fields[0] = this.article_support_name;

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete() {
        try {
            String query = "DELETE FROM articles_supports WHERE article_support_id=?";

            String[] fields = new String[1];
            fields[0] = Integer.toString(this.article_support_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        try {
            String query = "UPDATE articles_supports SET article_support_name=? WHERE article_support_id=?";

            String[] fields = new String[2];
            fields[0] = this.article_support_name;
            fields[1] = Integer.toString(this.article_support_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
