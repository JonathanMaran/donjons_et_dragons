package donjons_et_dragons;

public class Spell {
	String spellName;
	Integer spellAttackForce;

	public Spell(String scSpellName, Integer scSpellAttackForce) {
		this.spellName = scSpellName;
		this.spellAttackForce = scSpellAttackForce;
	}
	
	public String toString() {
		return spellName + " " + spellAttackForce;
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
	
	public void setSpellAttackForce(Integer pSpellAttackForce) {
		spellAttackForce = pSpellAttackForce;
	}
}