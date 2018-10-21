package controllers;

import dialogs.articles.ArticlesModuleDialog;
import dialogs.ModulesDialog;
import dialogs.articles.MoviesArticleModuleDialog;

public class ArticlesModuleController {

    public static void previousDialog() {
        ArticlesModuleDialog.close();
        ModulesDialog.main(null);
    }
    
    public static void openMoviesArticleModuleDialog() {
        ArticlesModuleDialog.close();
        MoviesArticleModuleDialog.main(null);
    }
    
}