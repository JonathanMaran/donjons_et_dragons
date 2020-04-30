package donjons_et_dragons;

public class Spell {
	String spellName;
	Integer spellAttackForce;

	public Spell(String scSpellName, Integer scSpellAttackForce) {
		this.spellName = scSpellName;
		this.spellAttackForce = scSpellAttackForce;
	}
	
	// ********** getters **********

	public int getSpellAttackForce() {
		return spellAttackForce;
	}

	public String getSpellName() {
		return spellName;
	}

	// ********** setters **********
	
	public void setSpellName(String pSpellName) {
		spellName = pSpellName;
	}
}