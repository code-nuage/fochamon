package fochamon;

import fochamon.Views.Home;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
    	SceneManager sm = new SceneManager();
    	SceneManager.setView(new Home());
    	
        Application.launch(sm.getClass());
    }
}
