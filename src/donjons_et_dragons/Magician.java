package donjons_et_dragons;

public class Magician extends Character {
	
	private String philter;
	Spell spell;

	//constructeur (new)
	public Magician(String scName, String scImg, Integer scHealthPoints, Integer scAttackForce, String scPhilter, String scSpellName, Integer scSpellAttackForce) {
		super(scName, scImg, scHealthPoints, scAttackForce);
		this.philter = scPhilter;
		this.spell = new Spell(scSpellName, scSpellAttackForce) ;

	}

	public String toString() {
		return super.toString() + ", Nom du philtre: " + philter + ", puis le sort et sa force: " + spell;
	}

	// ********** getters **********

	public String getPhilter() {
		return philter;
	}

	//retourne l'objet Spell
	public Spell getSpell() {
		return spell;
	}

	// ********** setters **********

	public void setPhilter(String pPhilter) {
		philter = pPhilter;
	}

	public void setSpell(Spell pSpell) {
		spell = pSpell;
	}


}