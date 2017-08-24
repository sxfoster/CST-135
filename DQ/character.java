//This code was created by Stephan Foster and is my own work.

package application;

import java.util.Random;

abstract class character {
	private String name, gender, alignment, playerClass;
	private int strength, dexterity, constitution, intelligence, wisdom, charisma;
	public character() {
	}
	public character(String name, String gender, String alignment, String playerClass, int strength, int dexterity,
			int constitution, int intelligence, int wisdom, int charisma) {
		this.name = name;
		this.gender = gender;
		this.alignment = alignment;
		this.playerClass = playerClass;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
	public character(character Char){
		this.name = Char.name;
		this.gender = Char.gender;
		this.alignment = Char.alignment;
		this.playerClass = Char.playerClass;
		this.strength = Char.strength;
		this.dexterity = Char.dexterity;
		this.constitution = Char.constitution;
		this.intelligence = Char.intelligence;
		this.wisdom = Char.wisdom;
		this.charisma = Char.charisma;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public String getPlayerclass() {
		return playerClass;
	}
	public void setPlayerclass(String playerClass) {
		this.playerClass = playerClass;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
    public static int randNum(int low, int high) {
    	Random randomNumber = new Random();
    	int num = randomNumber.nextInt(high) + low; 
    	while(num < low || num > high){
    		num = randomNumber.nextInt(high) + low;
    	}
    	return num;
    }
	@Override
	public String toString() {
		return "\ncharacter name: " + this.getName() + "\ngender: " + this.getGender() + "\nalignment: " + this.getAlignment() + "\nplayerClass: "
				+ this.getPlayerclass() + "\nstrength: " + this.getStrength() + "\ndexterity: " + this.getDexterity() + "\nconstitution: " + this.getConstitution()
				+ "\nintelligence: " + this.getIntelligence() + "\nwisdom: " + this.getWisdom() + "\ncharisma: " + this.getCharisma();
	}
	
}
