package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/*
 * DHBW Fallstudie
 * Unternehmensplanspiel f�r ein Produktionsunternehmen von Schuhen
 * 
 * Team: Ivo Christ, Frantz Nagel, Dominik Albert, Mayur Dass, Talha Butt, Philipp H�ffner, Florian Sehorz
 * 
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
