package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class UserStatusEntity {

    private int user_status_id;
    private String user_status_name;

    public UserStatusEntity(int user_status_id, String user_status_name) {
        this.user_status_id = user_status_id;
        this.user_status_name = user_status_name;
    }

    public int getUser_status_id() {
        return user_status_id;
    }

    public String getUser_status_name() {
        return user_status_name;
    }

    public static ArrayList<UserStatusEntity> select(String id, String name, int resultNumber) {
        ArrayList<UserStatusEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM user_status ";
            query += "WHERE 1=1 ";

            if (!"".equals(id)) {
                query += "AND user_status_id=" + id + " ";
            }
            if (!"".equals(name)) {
                query += "AND user_status_name LIKE ('%" + name + "%') ";
            }

            query += "LIMIT " + Integer.toString(resultNumber);

            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int selectedId = statement.getInt("user_status_id");
                    String selectedName = statement.getString("user_status_name");

                    UserStatusEntity status = new UserStatusEntity(selectedId, selectedName);
                    result.add(status);
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
            String query = "INSERT INTO user_status (user_status_name) VALUES (?)";

            String[] fields = new String[1];
            fields[0] = this.user_status_name;

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        try {
            String query = "UPDATE user_status SET user_status_name=? WHERE user_status_id=?";

            String[] fields = new String[5];
            fields[0] = Integer.toString(this.user_status_id);
            fields[1] = this.user_status_name;

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
