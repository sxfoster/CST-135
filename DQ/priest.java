//This code was created by Stephan Foster and is my own work.

package random_work;

import java.util.ArrayList;

public class priest extends character implements spellCaster {
	private static String priestClass = "Priest";
	private String holySymbol, diety;
	private ArrayList<String> memorizedSpells = new ArrayList<String>();
	private ArrayList<String>knownSpells = new ArrayList<String>();
	
	public priest() {
		super("John Smith", "male", "lawful good", priestClass, randNum(1,18), randNum(1,18), randNum(4,18), randNum(1,18), randNum(12,20), randNum(4,20));
		this.holySymbol = "Cross";
		this.diety = "Pelor";
	}

	public priest(String name, String gender, String alignment, int strength, int dexterity,
			int constitution, int intelligence, int wisdom, int charisma, String holySymbol, String diety) {
		super(name, gender, alignment, priestClass, strength, dexterity, constitution, intelligence, wisdom, charisma);
		this.holySymbol = holySymbol;
		this.diety = diety;
	}
	
	public priest(priest myPriest){
		super(myPriest);
		this.holySymbol = myPriest.getHolySymbol();
		this.diety = myPriest.getDiety();
	}

	public String getHolySymbol() {
		return holySymbol;
	}

	public void setHolySymbol(String holySymbol) {
		this.holySymbol = holySymbol;
	}

	public String getDiety() {
		return diety;
	}

	public void setDiety(String diety) {
		this.diety = diety;
	}

	@Override
	public String toString() {
		return super.toString() + "\nholySymbol: " + holySymbol + "\ndiety: " + diety + "\nknown spells: " + printSpells(this.knownSpells) + "\nMemorized spells: " + printSpells(this.memorizedSpells);
	}

	public void castSpell(String spell) {
		if(this.memorizedSpells.contains(spell)){
			this.memorizedSpells.remove(spell);
		}
		
	}

	public void forgetSpell(String spell) {
		if(this.knownSpells.contains(spell)){
			this.knownSpells.remove(spell);
		}		
	}

	public void learnSpell(String spell) {
		if(!this.knownSpells.contains(spell) && this.getWisdom() >= 12) {
		this.knownSpells.add(spell);
		}
	}

	public void memorizeSpell(String spell) {
		if(this.knownSpells.contains(spell) && memorizedSpells.size() < this.getWisdom() / 2){
			this.memorizedSpells.add(spell);
		}
	}
	
	public void memorizeSpells(String spell, int x) {
		for(int y = 0; y < x; y++){
			this.memorizeSpell(spell);		
		}
	}
	
	public String printSpells(ArrayList<String> spells) {
		String spellList = "";
		for(int x = 0; x < spells.size(); x++){
			if(x < spells.size() - 1){
				spellList += spells.get(x) + ", ";
			}
			else {
				spellList += spells.get(x) + " ";
			}
		}
		return spellList;
	}

}
