package controllers;

import dialogs.ConnectionDialog;
import dialogs.LoginDialog;
import dialogs.ModulesDialog;
import entities.UserEntity;

public class LoginController {

    public static void previousDialog() {
        LoginDialog.close();
        ConnectionDialog.main(null);
    }

    public static void nextDialog() {
        LoginDialog.close();
        ModulesDialog.main(null);
    }

    public static boolean identify(String email, String password) {
        boolean result = false;

        System.out.println(email);
        System.out.println(password);
        
        if (UserEntity.select("", email, password, 1).size() > 0) {
            result = true;
        }

        return result;
    }

}
