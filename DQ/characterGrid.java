package application;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class characterGrid extends VBox {

	public characterGrid(){
		gameCharacter gc = new gameCharacter();
		gc.	setPadding(new Insets(25, 0, 0, 25));
		this.getChildren().add(gc);
	}
}
