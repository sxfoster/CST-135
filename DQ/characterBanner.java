
package application;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class characterBanner extends VBox {
	public characterBanner(){
		ImageView banner = new ImageView(
				new Image(
						"http://dnd.wizards.com/sites/default/files/media/styles/story_banner/public/images/head-banner/hero_dmgscreen_0.jpg?itok=Iy7FLffb",
						400, 400, true, true));
		this.getChildren().add(banner);
	}

}
