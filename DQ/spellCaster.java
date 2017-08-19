//This code was created by Stephan Foster and is my own work.

package random_work;

import java.util.ArrayList;

public interface spellCaster {
	public abstract void castSpell(String spell);
	public abstract void forgetSpell(String spell);
	public abstract void learnSpell(String spell);
	public abstract void memorizeSpell(String spell);
	public abstract String printSpells(ArrayList<String> spells);
	
}
