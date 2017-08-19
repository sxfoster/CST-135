//This code was created by Stephan Foster and is my own work.

package random_work;

public class generateCharacter {

	public static void main(String[] args) {
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
		System.out.println(myPriest.toString());
	}
}
