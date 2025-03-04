package fochamon;

import fochamon.Fochamons.Fistofeu;
import fochamon.Fochamons.Peliklukluxklan;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main {
//	@Override
//	public void start(Stage stage) {
//		
//    }
//	
//    public static void main(String[] args) {
//        launch(args);
//    }
	public static void main(String[] args) {
		Team team = new Team("Team");
		
		team.addFochamon(new Peliklukluxklan());
		team.addFochamon(new Fistofeu());

		System.out.println(team);
		System.out.println(new Fistofeu());
	}
}
