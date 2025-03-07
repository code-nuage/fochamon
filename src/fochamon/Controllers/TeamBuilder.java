package fochamon.Controllers;

import fochamon.SceneManager;
import javafx.fxml.FXML;

public class TeamBuilder {
	@FXML
	public void initialize() {}
	
	@FXML
	private void back() {
        SceneManager.setView(new fochamon.Views.Home());
	}
}
