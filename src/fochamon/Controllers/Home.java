package fochamon.Controllers;

import fochamon.SceneManager;
import fochamon.Views.TeamBuilder;
import javafx.fxml.FXML;

public class Home {
	@FXML
	public void initialize() {}
	
	@FXML
	private void teambuilder() {
		System.out.println("Test");
        SceneManager.setView(new TeamBuilder());
	}
	
	@FXML
	private void fight() {
		System.out.println("Enter in fight");
	}
	
	@FXML
	private void quit() { System.exit(0); }
}
