package application;

import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class characterLogGrid extends VBox {
	character player;
	TextArea characterLog = new TextArea();
	String gameText;
	public characterLogGrid(){
		//this area will be used as an interactive text-based adventure
		characterLog.setEditable(false);
		characterLog.setText("Your adventure begins. Please click to create a character.\n");
		characterLog.setOnMouseClicked(e -> {
			if(player == null){
				this.setPlayer(new priest());
			}	
		});
		characterLog.setOnKeyPressed(e -> {
			switch (e.getCode()){
			case C: this.viewPlayer(this.player);
				break;
			default:
				break;
			}
		});
		this.getChildren().add(characterLog);
	}
	public void addLogText(String text){
		this.characterLog.setText(this.characterLog.getText() + text);
		this.characterLog.setScrollTop(Double.MAX_VALUE);
	}
	public void setPlayer(character c){
		this.player = c;
		this.addLogText("Your character has been created. Press C to view character stats.\n");
	}
	public void viewPlayer(character c){
		this.addLogText(c.toString());
	}
}
