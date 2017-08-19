//This code was created by Stephan Foster and is my own work.

package random_work;

import java.util.ArrayList;

public interface spellCaster {
	void castSpell(String spell);
	void forgetSpell(String spell);
	void learnSpell(String spell);
	void memorizeSpell(String spell);
	String printSpells(ArrayList<String> spells);
	
}
