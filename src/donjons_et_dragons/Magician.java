package donjons_et_dragons;

public class Magician {
	String name;
	Integer healthPoints;
	Integer attackForce;
	String philter;
	Spell spell;
	
	// ********** getters **********
	
	public String getNameMagician() {
		return name;
	}
	
	public int getHealthPointsMagician() {
		return healthPoints;
	}
	
	public int getAttackForceMagician() {
		return attackForce;
	}

	public String getPhilterMagician() {
		return philter;
	}
	
	//retourne l'objet Spell
	public Spell getSpellMagician() {
		return spell;
	}
	
	// ********** setters **********

	public void setNameMagician(String pName) {
		name = pName;
	}
	
	public void setHealthPointsMagician(int pHealthPoints) {
		healthPoints = pHealthPoints;
	}
	
	public void setAttackForceMagician(int pAttackForce) {
		attackForce = pAttackForce;
	}
	
	public void setPhilterMagician(String pPhilter) {
		philter = pPhilter;
	}
	
	public void setSpellMagician(Spell pSpell) {
		spell = pSpell;
	}
	
	//constructeur (new)
	public Magician(String scName, Integer scHealthPoints, Integer scAttackForce, String scPhilter, String scSpellName, Integer scSpellAttackForce) {
		this.name = scName;
		this.healthPoints = scHealthPoints;
		this.attackForce = scAttackForce;
		this.philter = scPhilter;
		this.spell = new Spell(scSpellName, scSpellAttackForce) ;
		
	}
}