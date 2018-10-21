package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class PriceHistoricEntity {

    private String price_historic_date;
    private ArticleEntity price_historic_article;
    private float price_historic_article_price;

    public PriceHistoricEntity(String price_historic_date, ArticleEntity price_historic_article, float price_historic_article_price) {
        this.price_historic_date = price_historic_date;
        this.price_historic_article = price_historic_article;
        this.price_historic_article_price = price_historic_article_price;
    }

    public String getPrice_historic_date() {
        return price_historic_date;
    }

    public void setPrice_historic_date(String price_historic_date) {
        this.price_historic_date = price_historic_date;
    }

    public ArticleEntity getPrice_historic_article() {
        return price_historic_article;
    }

    public void setPrice_historic_article(ArticleEntity price_historic_article) {
        this.price_historic_article = price_historic_article;
    }

    public float getPrice_historic_article_price() {
        return price_historic_article_price;
    }

    public void setPrice_historic_article_price(float price_historic_article_price) {
        this.price_historic_article_price = price_historic_article_price;
    }
    
    public static ArrayList<PriceHistoricEntity> select(String date, String article_title, int resultQuantity) {
        ArrayList<PriceHistoricEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM prices_historic ";
            query += "JOIN articles ON articles.article_id=prices_historic.price_historic_article_id ";
            query += "WHERE 1=1 ";

            if (!"".equals(date)) {
                query += "AND price_historic_date=" + date + " ";
            }
            if (!"".equals(article_title)) {
                query += "AND article_title LIKE ('%" + article_title + "%') ";
            }

            query += "LIMIT " + Integer.toString(resultQuantity);

            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    String selectedDate = statement.getString("price_historic_date");
                    Float selectedArticlePrice = statement.getFloat("price_historic_article_price");
                    int selectedArticleId = statement.getInt("article_id");
                    ArticleEntity selectedArticle = ArticleEntity.select(Integer.toString(selectedArticleId), "", 1).get(0);
                    
                    PriceHistoricEntity selectedEntity = new PriceHistoricEntity(selectedDate, selectedArticle, selectedArticlePrice);
                    result.add(selectedEntity);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
    
}
