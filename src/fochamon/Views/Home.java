package fochamon.Views;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Home extends Application {
	@Override
	public void start(final Stage primaryStage) {
		try {
			final URL url = getClass().getResource("/Home.fxml");
			final FXMLLoader fxmlLoader = new FXMLLoader(url);
			final AnchorPane root = (AnchorPane) fxmlLoader.load();
			final Scene scene = new Scene(root, 1280, 720);
			
			primaryStage.setScene(scene);
			scene.getStylesheets().add(
					getClass().getResource("/Main.css").toExternalForm()
			);
			scene.getStylesheets().add(
				getClass().getResource("/Home.css").toExternalForm()
			);
		} catch (IOException ex) {
			System.err.println("Erreur au chargement: " + ex);
		}
		primaryStage.setTitle("Test FXML");
		primaryStage.show();
	}
}
