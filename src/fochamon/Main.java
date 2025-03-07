package fochamon;

import fochamon.Views.Home;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
    	SceneManager sm = new SceneManager();
    	
        Application.launch(sm.getClass());
        
        SceneManager.setView(new Home());
    }
}
