

package application;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class gameCharacter extends VBox {
	
	public gameCharacter(){
		//create character and use interface
		priest myPriest = new priest();
		myPriest.learnSpell("heal");
		myPriest.learnSpell("heal");
		myPriest.learnSpell("harm");
		myPriest.learnSpell("bless");
		myPriest.learnSpell("turn undead");
		myPriest.forgetSpell("turn undead");
		myPriest.memorizeSpell("heal");
		myPriest.memorizeSpell("harm");
		myPriest.memorizeSpell("turn undead");
		myPriest.memorizeSpell("bless");
		myPriest.memorizeSpells("heal", 3);
		myPriest.memorizeSpells("harm", 3);
		myPriest.memorizeSpells("bless", 3);
		myPriest.castSpell("heal");
		
		ArrayList<Label> labels = getLabels(myPriest);
		for(int x = 0; x < labels.size(); x++){
			this.getChildren().add(labels.get(x));
		}
	}
	
	//dynamically generates labels for the character screen grabbing parent properties
	public ArrayList<Label> getLabels(character c) {
		
		ArrayList<Label> labels = new ArrayList<Label>();
		for(Field f : c.getClass().getSuperclass().getDeclaredFields()){
			Method getter = null;
			try {
				getter = c.getClass().getSuperclass().getDeclaredMethod("get" + SentenceCase(f.getName()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			String val = null;
			try {
				val = getter.invoke(c) + "";
			} catch (Exception e) {
				e.printStackTrace();
			}
			Label l = new Label(f.getName() + ": " + val);
			labels.add(l);
		}
		return labels;
	}
	
	public String SentenceCase(String s){
		char[] letters = s.toLowerCase().toCharArray();
		letters[0] = Character.toUpperCase(letters[0]);
		return new String (letters);
	}
}
