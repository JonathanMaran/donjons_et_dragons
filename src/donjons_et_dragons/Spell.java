package donjons_et_dragons;

public class Spell {
	private String spellName;
	private Integer spellAttackForce;

	public Spell(String scSpellName, Integer scSpellAttackForce) {
		this.spellName = scSpellName;
		this.spellAttackForce = scSpellAttackForce;
	}
	
	public String toString() {
		return spellName + " " + spellAttackForce;
	}
	
	// ********** getters **********

	public int getAttackForce() {
		return spellAttackForce;
	}

	public String getName() {
		return spellName;
	}

	// ********** setters **********
	
	public void setName(String pSpellName) {
		spellName = pSpellName;
	}
	
	public void setAttackForce(Integer pSpellAttackForce) {
		spellAttackForce = pSpellAttackForce;
	}
}