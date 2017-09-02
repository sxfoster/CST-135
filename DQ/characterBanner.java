
package application;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class characterBanner extends VBox {
	public characterBanner(){
		Button btnBanner = new Button("Load Banner");
		this.getChildren().add(btnBanner);
		btnBanner.setOnAction(e -> {
			this.getChildren().clear();
			ImageView banner = new ImageView(
					new Image(
							"http://dnd.wizards.com/sites/default/files/media/styles/story_banner/public/images/head-banner/hero_dmgscreen_0.jpg?itok=Iy7FLffb",
							800, 400, true, true));
			this.getChildren().add(banner);			
		});

	}
	
	public ImageView generateImage(String imagePath, double width, double height){	
		return new ImageView(new Image(imagePath,width,height,true,true));
	}

}
