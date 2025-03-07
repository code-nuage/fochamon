package fochamon.Views;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {
    // +-- PROPERTIES --+
	private String fxmlPath;
	private String[] stylesPath;
	private int width;
	private int height;
	
    // +-- CONSTRUCTOR --+
	public View(String fxmlPath, String[] stylesPath, int width, int height) {
		this.fxmlPath = fxmlPath;
		this.stylesPath = stylesPath;
		this.width = width;
		this.height = height;
	}
	
	public void load(Stage stage) {
		try {
			URL url = getClass().getResource(this.fxmlPath);
	        Parent newPage = FXMLLoader.load(url);
	        
	        Scene scene = new Scene(newPage, this.width, this.height);
	        stage.setScene(scene);
	        
	        for (int i = 0; i < this.stylesPath.length; i++) {
		        scene.getStylesheets().add(
		        		getClass().getResource(this.stylesPath[i]).toExternalForm()
		        );
			}
		} catch (IOException ex) {
			System.err.println("Erreur au chargement: " + ex);
		}
	}
}
