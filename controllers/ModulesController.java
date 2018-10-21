package controllers;

import dialogs.articles.ArticlesModuleDialog;
import dialogs.commands.CommandsModuleDialog;
import dialogs.LoginDialog;
import dialogs.ModulesDialog;
import dialogs.users.UsersModuleDialog;

public class ModulesController {
    
    public static void previousDialog() {
        ModulesDialog.close();
        LoginDialog.main(null);
    }
    
    public static void openUsersModuleDialog() {
        ModulesDialog.close();
        UsersModuleDialog.main(null);
    }
    
    public static void openArticlesModuleDialog() {
        ModulesDialog.close();
        ArticlesModuleDialog.main(null);
    }
    
    public static void openCommandsModuleDialog() {
        ModulesDialog.close();
        CommandsModuleDialog.main(null);
    }
    
}
