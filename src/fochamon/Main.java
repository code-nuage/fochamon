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
		
		Type FIRE = new Type("Fire");
		Type WATER = new Type("Water");
		Type PLANT = new Type("Plant");

		FIRE.addStrength(PLANT).addWeakness(FIRE).addWeakness(WATER);
		WATER.addStrength(FIRE).addWeakness(WATER).addWeakness(PLANT);
		PLANT.addStrength(PLANT).addWeakness(PLANT).addWeakness(FIRE);
		
		team.addFochamon(new Peliklukluxklan());
		team.addFochamon(new Fistofeu());

		System.out.println(team);

//		System.out.println(FIRE + "\n" + WATER + "\n" + PLANT);
	}
}
