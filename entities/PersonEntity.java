package entities;

import java.sql.ResultSet;
import java.util.ArrayList;
import utils.DatabaseConnection;

public class PersonEntity {

    private int person_id;
    private String person_name;

    public PersonEntity(int person_id, String person_name) {
        this.person_id = person_id;
        this.person_name = person_name;
    }

    public int getPerson_id() {
        return this.person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public static ArrayList<PersonEntity> select(String id, String name, int resultNumber) {
        ArrayList<PersonEntity> result = new ArrayList<>();

        try {
            String query = "SELECT * FROM persons ";
            query += "WHERE 1=1 ";

            if (id != "") {
                query += "AND person_id=" + id + " ";
            }
            if (name != "") {
                query += "AND person_name LIKE ('%" + name + "%') ";
            }

            query += "LIMIT " + Integer.toString(resultNumber);

            ResultSet statement = DatabaseConnection.query(query, null, false);

            if (statement != null) {
                while (statement.next()) {
                    int selectedId = statement.getInt("person_id");
                    String selectedName = statement.getString("person_name");

                    PersonEntity person = new PersonEntity(selectedId, selectedName);
                    result.add(person);
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
            String query = "INSERT INTO persons (person_name) VALUES (?)";

            String[] fields = new String[1];
            fields[0] = this.person_name;

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        try {
            String query = "UPDATE persons SET person_name=? WHERE person_id=?";

            String[] fields = new String[2];
            fields[0] = this.person_name;
            fields[1] = Integer.toString(this.person_id);

            DatabaseConnection.query(query, fields, true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
