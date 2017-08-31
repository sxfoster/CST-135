package application;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class characterGrid extends VBox {

	public characterGrid(){
		Button btnCreateCharacter = new Button("Create Character");
		btnCreateCharacter.setOnAction(new createCharacterHandler(this));
		this.getChildren().add(btnCreateCharacter);
	}
}
