package fochamon;

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
		Type FIRE = new Type("Fire");
		Type WATER = new Type("Water");
		Type PLANT = new Type("Plant");

		FIRE.addStrength(PLANT).addWeakness(FIRE).addWeakness(WATER);
		WATER.addStrength(FIRE).addWeakness(WATER).addWeakness(PLANT);
		PLANT.addStrength(PLANT).addWeakness(PLANT).addWeakness(FIRE);

		Fochamon PELIKLUKLUXKLAN = new Fochamon("Peliklukluxklan", 34, 12, 14, 6, 8, 74);
		PELIKLUKLUXKLAN.addType(PLANT);
		PELIKLUKLUXKLAN.addType(FIRE);

		System.out.println(PELIKLUKLUXKLAN);

//		System.out.println(FIRE + "\n" + WATER + "\n" + PLANT);
	}
}
