package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class CommandStateEntity {

    private int command_state_id;
    private String command_state_name;

    public CommandStateEntity(int command_state_id, String command_state_name) {
        this.command_state_id = command_state_id;
        this.command_state_name = command_state_name;
    }

    public int getCommand_state_id() {
        return command_state_id;
    }

    public void setCommand_state_id(int command_state_id) {
        this.command_state_id = command_state_id;
    }

    public String getCommand_state_name() {
        return command_state_name;
    }

    public void setCommand_state_name(String command_state_name) {
        this.command_state_name = command_state_name;
    }

    public static ArrayList<CommandStateEntity> select(String id, String name, int resultQuantity) {
        ArrayList<CommandStateEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM commands_states ";
            query += "WHERE 1=1 ";
            
            if (!"".equals(id)) {
                query += "AND command_state_id=" + id + " ";
            }
            if (!"".equals(name)) {
                query += "AND command_state_name LIKE ('%" + name + "%') ";
            }

            query += "LIMIT " + Integer.toString(resultQuantity);

            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int selectedId = statement.getInt("command_state_id");
                    String selectedName = statement.getString("command_state_name");
                    
                    CommandStateEntity selectedEntity = new CommandStateEntity(selectedId, selectedName);
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
