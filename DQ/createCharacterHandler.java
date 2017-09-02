package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;

public class createCharacterHandler implements EventHandler<ActionEvent> {
	characterGrid cg;
	public createCharacterHandler(characterGrid characterGrid) {
		this.cg = characterGrid;
	}

	@Override
	public void handle(ActionEvent e) {
		gameCharacter gc = new gameCharacter();
		gc.setPadding(new Insets(25, 0, 0, 25));
		cg.getChildren().clear();
		cg.getChildren().add(gc);
	}

}
