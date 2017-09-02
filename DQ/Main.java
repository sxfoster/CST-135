package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	BorderPane root = new BorderPane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			characterBanner cb = new characterBanner();
			root.setTop(cb);
			characterLogGrid charLog = new characterLogGrid();
			root.setCenter(charLog);
			Scene scene = new Scene(root,800,800);
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
