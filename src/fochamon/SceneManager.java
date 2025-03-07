package fochamon;

import fochamon.Views.Home;
import fochamon.Views.View;
import javafx.application.Application;
import javafx.stage.Stage;

public class SceneManager extends Application {
	private static Stage stage;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		stage = arg0;
		System.out.println(stage);
		
		setView(new Home());
		
		stage.setTitle("Fochamon");
		stage.show();
	}

	public static void setView(View view) { 
		System.out.println(stage);
		view.load(stage);
	}
}
