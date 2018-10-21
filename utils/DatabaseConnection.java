package utils;

import java.sql.*;

public class DatabaseConnection {

    private static String databaseAddress = "//localhost/medialibraryjava";

    public static void setDatabaseAddress(String newDatabaseAddress) {
        DatabaseConnection.databaseAddress = newDatabaseAddress;
    }

    public static String getDatabaseAddress() {
        return DatabaseConnection.databaseAddress;
    }

    public static Connection getConnection() {
        Connection conn = null;
        
        try {
            String address = getDatabaseAddress();
            conn = DriverManager.getConnection("jdbc:mysql:" + address, "root", "");
            if (!conn.isValid(0)) {
                conn = null;
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        
        return conn;
    }

    public static ResultSet query(String sql, String[] fields, boolean toUpdate) {
        ResultSet result = null;

        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            if (fields != null) {
                for (int i = 0; i < fields.length; i++) {
                    pst.setString(i + 1, fields[i]);
                }
            }
            if (toUpdate) {
                pst.executeUpdate();
            }
            else {
                result = pst.executeQuery();
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return result;
    }

    public static void updateConnectionTesting() {
        if (testConnection(100)) {
            DatabaseConnection.updateConnectionTesting();
        }
        else {
            System.out.println("Connection lost.");
        }
    }

    public static boolean testConnection(int timeout) {
        boolean result = false;

        try {
            Connection conn = getConnection();
            result = conn.isValid(timeout);
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }

        return result;
    }

}
