package controllers;

import dialogs.ConnectionDialog;
import dialogs.LoginDialog;
import utils.DatabaseConnection;

public class ConnectionController {
    
    public static String getDatabaseAddress() {
        String address = DatabaseConnection.getDatabaseAddress();
        return address;
    }
    
    public static void setDatabaseAddress(String address) {
        DatabaseConnection.setDatabaseAddress(address);
    }
    
    public static boolean testDatabaseConnection() {
        boolean result = false;
        
        if (DatabaseConnection.getConnection() != null) {
            result = true;
        }
        
        return result;
    }
    
    public static void nextDialog() {
        ConnectionDialog.close();
        LoginDialog.main(null);
    }
    
}
