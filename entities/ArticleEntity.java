package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class ArticleEntity {

    protected int article_id;
    protected String article_title;
    protected float article_price;
    protected int article_year;
    protected int article_stock;
    protected String article_image;
    protected ArticleStateEntity article_state;
    protected ArticleSupportEntity article_support;

    public ArticleEntity(int article_id, String article_title, float article_price, int article_year, int article_stock, String article_image, ArticleStateEntity article_state, ArticleSupportEntity article_support) {
        this.article_id = article_id;
        this.article_title = article_title;
        this.article_price = article_price;
        this.article_year = article_year;
        this.article_stock = article_stock;
        this.article_image = article_image;
        this.article_state = article_state;
        this.article_support = article_support;
    }

    public int getArticle_id() {
        return article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public float getArticle_price() {
        return article_price;
    }

    public int getArticle_year() {
        return article_year;
    }

    public int getArticle_stock() {
        return article_stock;
    }

    public String getArticle_image() {
        return article_image;
    }

    public ArticleStateEntity getArticle_state() {
        return article_state;
    }

    public ArticleSupportEntity getArticle_support() {
        return article_support;
    }

    public static ArrayList<ArticleEntity> select(String article_id, String article_title, int resultNumber) {
        ArrayList<ArticleEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM articles ";
            query += "WHERE 1=1 ";

            if (!"".equals(article_id)) {
                query += "AND article_id=" + article_id + " ";
            }
            if (!"".equals(article_title)) {
                query += "AND article_title LIKE ('%" + article_title + "%') ";
            }

            query += "LIMIT " + Integer.toString(resultNumber);

            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int id = statement.getInt("article_id");
                    String title = statement.getString("article_title");
                    float price = statement.getFloat("article_price");
                    int year = statement.getInt("article_year");
                    int stock = statement.getInt("article_stock");
                    String image = statement.getString("article_image");

                    int articleStateID = statement.getInt("article_state_id");
                    ArticleStateEntity state = ArticleStateEntity.select(Integer.toString(articleStateID), "", 1).get(0);

                    int supportID = statement.getInt("article_support_id");
                    ArticleSupportEntity support = ArticleSupportEntity.select(Integer.toString(supportID), "", 1).get(0);

                    ArticleEntity article = new ArticleEntity(id, title, price, year, stock, image, state, support);
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
            String query = "INSERT INTO articles (article_title, article_price, article_year, article_stock, article_image, article_state_id, article_support_id) VALUES (?,?,?,?,?,?,?)";

            String[] fields = new String[7];
            fields[0] = this.article_title;
            fields[1] = Float.toString(this.article_price);
            fields[2] = Integer.toString(this.article_year);
            fields[3] = Integer.toString(this.article_stock);
            fields[4] = this.article_image;
            fields[5] = Integer.toString(this.article_state.getArticle_state_id());
            fields[6] = Integer.toString(this.article_support.getArticle_support_id());

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete() {
        try {
            String query = "DELETE FROM articles WHERE article_id=?";

            String[] fields = new String[1];
            fields[0] = Integer.toString(this.article_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update() {
        try {
            String query = "UPDATE articles SET article_title=?, article_price=?, "
                    + "article_year=?, article_stock=?, article_image=?, "
                    + "article_state_id=?, article_support_id=? WHERE article_id=?";

            String[] fields = new String[8];
            fields[0] = this.article_title;
            fields[1] = Float.toString(this.article_price);
            fields[2] = Integer.toString(this.article_year);
            fields[3] = Integer.toString(this.article_stock);
            fields[4] = this.article_image;
            fields[5] = Integer.toString(this.article_state.getArticle_state_id());
            fields[6] = Integer.toString(this.article_support.getArticle_support_id());
            fields[7] = Integer.toString(this.article_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
