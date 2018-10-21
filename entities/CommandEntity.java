package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class CommandEntity {

    private String command_date;
    private UserEntity command_user;
    private CommandStateEntity command_state;
    private ArrayList<CommandArticleEntity> command_articles;

    public CommandEntity(String command_date, UserEntity command_user, CommandStateEntity command_state, ArrayList<CommandArticleEntity> command_articles) {
        this.command_date = command_date;
        this.command_user = command_user;
        this.command_state = command_state;
        this.command_articles = command_articles;
    }

    public String getCommand_date() {
        return command_date;
    }

    public void setCommand_date(String command_date) {
        this.command_date = command_date;
    }

    public UserEntity getCommand_user() {
        return command_user;
    }

    public void setCommand_user(UserEntity command_user) {
        this.command_user = command_user;
    }

    public CommandStateEntity getCommand_state() {
        return command_state;
    }

    public void setCommand_state(CommandStateEntity command_state) {
        this.command_state = command_state;
    }

    public ArrayList<CommandArticleEntity> getCommand_articles() {
        return command_articles;
    }

    public void setCommand_articles(ArrayList<CommandArticleEntity> command_articles) {
        this.command_articles = command_articles;
    }
    
    public int getArticlesQuantity() {
        int result = 0;
        
        for (CommandArticleEntity command_article : command_articles) {
            result += command_article.getCommand_article_quantity();
        }
        
        return result;
    }
    
    public float getTotalPrice() {
        float result = 0.0f;
        
        for (CommandArticleEntity command_article : command_articles) {
            result += command_article.getCommand_article_quantity() * command_article.getCommand_article_price_historic().getPrice_historic_article_price();
        }
        
        return result;
    }

    public static ArrayList<CommandEntity> select(String date, String user_name, int resultQuantity) {
        ArrayList<CommandEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM commands ";
            
            if (!"".equals(user_name)) {
                query += "JOIN users ON users.user_id=commands.command_user_id ";
                query += "JOIN persons ON persons.person_id=users.user_person_id ";
            }
            
            query += "WHERE 1=1 ";

            if (!"".equals(date)) {
                query += "AND command_date='" + date + "' ";
            }
            if (!"".equals(user_name)) {
                query += "AND person_name LIKE ('%" + user_name + "%') ";
            }

            query += "LIMIT " + Integer.toString(resultQuantity);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    String selectedDate = statement.getString("command_date");
                    
                    int selectedUserId = statement.getInt("command_user_id");
                    UserEntity selectedUser = UserEntity.select(Integer.toString(selectedUserId), "", "", 1).get(0);
                    
                    int selectStateId = statement.getInt("command_state_id");
                    CommandStateEntity selectedState = CommandStateEntity.select(Integer.toString(selectStateId), "", 1).get(0);
                    
                    ArrayList<CommandArticleEntity> selectedCommandArticles = CommandArticleEntity.select(selectedDate, "", 100);
                    
                    CommandEntity selectedEntity = new CommandEntity(selectedDate, selectedUser, selectedState, selectedCommandArticles);
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
