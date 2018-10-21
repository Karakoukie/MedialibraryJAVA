package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class CommandArticleEntity {

    private String command_article_date;
    private ArticleEntity command_article;
    private int command_article_quantity;
    private PriceHistoricEntity command_article_price_historic;

    public CommandArticleEntity(String command_article_date, ArticleEntity command_article, int command_article_quantity, PriceHistoricEntity command_article_price_historic) {
        this.command_article_date = command_article_date;
        this.command_article = command_article;
        this.command_article_quantity = command_article_quantity;
        this.command_article_price_historic = command_article_price_historic;
    }

    public String getCommand_article_date() {
        return command_article_date;
    }

    public void setCommand_article_date(String command_article_date) {
        this.command_article_date = command_article_date;
    }

    public ArticleEntity getCommand_article() {
        return command_article;
    }

    public void setCommand_article(ArticleEntity command_article) {
        this.command_article = command_article;
    }

    public int getCommand_article_quantity() {
        return command_article_quantity;
    }

    public void setCommand_article_quantity(int command_article_quantity) {
        this.command_article_quantity = command_article_quantity;
    }

    public PriceHistoricEntity getCommand_article_price_historic() {
        return command_article_price_historic;
    }

    public void setCommand_article_price_historic(PriceHistoricEntity command_article_price_historic) {
        this.command_article_price_historic = command_article_price_historic;
    }
    
    public static ArrayList<CommandArticleEntity> select(String date, String article_id, int resultQuantity) {
        ArrayList<CommandArticleEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM commands_articles ";
            //query += "JOIN prices_historic ON prices_historic.price_historic_date=commands_articles.command_article_date ";
            query += "WHERE 1=1 ";

            if (!"".equals(date)) {
                query += "AND command_article_date='" + date + "' ";
            }
            if (!"".equals(article_id)) {
                query += "AND article_id=" + article_id + " ";
            }

            query += "LIMIT " + Integer.toString(resultQuantity);

            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    String selectedDate = statement.getString("command_article_date");
                    int selectedArticleId = statement.getInt("article_id");
                    int selectedArticleQuantity = statement.getInt("command_article_quantity");

                    ArticleEntity selectedArticle = ArticleEntity.select(Integer.toString(selectedArticleId), "", 1).get(0);
                    //PriceHistoricEntity selectedPriceHistoric = PriceHistoricEntity.select(selectedDate, "", 1).get(0);
                    
                    CommandArticleEntity selectedEntity = new CommandArticleEntity(selectedDate, selectedArticle, selectedArticleQuantity, null);
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
