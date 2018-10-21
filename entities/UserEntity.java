package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;
import utils.Hashing;

public class UserEntity {

    private int user_id;
    private String user_email;
    private String user_password;
    private UserStatusEntity user_status;
    private PersonEntity user_person;

    public UserEntity(int user_id, String user_email, String user_password, UserStatusEntity user_status, PersonEntity user_person) {
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_status = user_status;
        this.user_person = user_person;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public UserStatusEntity getUser_status() {
        return user_status;
    }

    public PersonEntity getUser_person() {
        return user_person;
    }

    public static ArrayList<UserEntity> select(String id, String email, String password, int resultNumber) {
        ArrayList<UserEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM users ";
            query += "WHERE 1=1 ";

            if (!"".equals(id)) {
                query += "AND user_id=" + id + " ";
            }
            if (!"".equals(email)) {
                query += "AND user_email LIKE ('%" + email + "%') ";
            }
            if (!"".equals(password)) {
                query += "AND user_password='" + Hashing.getSHA256Hash(password) + "' ";
            }

            query += "LIMIT " + Integer.toString(resultNumber);
            
            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int seletedId = statement.getInt("user_id");
                    String selectedEmail = statement.getString("user_email");
                    String selectedPassword = statement.getString("user_password");
                    int status_id = statement.getInt("user_status_id");
                    int person_id = statement.getInt("user_person_id");
                    UserStatusEntity status = UserStatusEntity.select(Integer.toString(status_id), "", 1).get(0);
                    PersonEntity person = PersonEntity.select(Integer.toString(person_id), "", 1).get(0);

                    UserEntity user = new UserEntity(seletedId, selectedEmail, selectedPassword, status, person);
                    result.add(user);
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
            String query = "INSERT INTO users (user_email, user_password, user_status_id, user_person_id) VALUES (?,?,?,?)";

            String[] fields = new String[4];
            fields[0] = this.user_email;
            fields[1] = Hashing.getSHA256Hash(this.user_password);
            fields[2] = Integer.toString(this.user_status.getUser_status_id());
            fields[3] = Integer.toString(this.user_person.getPerson_id());

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        try {
            String query = "UPDATE users SET user_email=?, user_password=?, user_status_id=?, user_person_id=? WHERE user_id=?";

            String[] fields = new String[5];
            fields[0] = this.user_email;
            fields[1] = Hashing.getSHA256Hash(this.user_password);
            fields[2] = Integer.toString(this.user_status.getUser_status_id());
            fields[3] = Integer.toString(this.user_person.getPerson_id());
            fields[4] = Integer.toString(this.user_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
