package fochamon;

import fochamon.Views.View;
import javafx.application.Application;
import javafx.stage.Stage;

public class SceneManager extends Application {
	private static Stage stage;
	private static View view;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		stage = arg0;
		
		try {
			loadView();
		} catch(Error e) {
			System.out.println("Loading error: " + e);
		}
		stage.setTitle("Fochamon");
		stage.show();
	}

	public static void setView(View v) { 
		view = v;
	}
	
	public static void loadView() {
		view.load(stage);
	}
}
