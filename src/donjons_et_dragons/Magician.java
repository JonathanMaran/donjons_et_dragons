package donjons_et_dragons;

public class Magician {
	private String name;
	private String img;
	private Integer healthPoints;
	private Integer attackForce;
	private String philter;
	Spell spell;

	//constructeur (new)
	public Magician(String scName, String scImg, Integer scHealthPoints, Integer scAttackForce, String scPhilter, String scSpellName, Integer scSpellAttackForce) {
		this.name = scName;
		this.healthPoints = scHealthPoints;
		this.attackForce = scAttackForce;
		this.philter = scPhilter;
		this.spell = new Spell(scSpellName, scSpellAttackForce) ;

	}

	// ********** getters **********
	// modifier les getters et setters (refactor)

	public String getName() {
		return name;
	}
	
	public String getImg() {
		return img;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public int getAttackForce() {
		return attackForce;
	}

	public String getPhilter() {
		return philter;
	}

	//retourne l'objet Spell
	public Spell getSpell() {
		return spell;
	}

	// ********** setters **********

	public void setName(String pName) {
		name = pName;
	}
	
	public void setImg(String pImg) {
		img = pImg;
	}

	public void setHealthPoints(int pHealthPoints) {
		healthPoints = pHealthPoints;
	}

	public void setAttackForce(int pAttackForce) {
		attackForce = pAttackForce;
	}

	public void setPhilter(String pPhilter) {
		philter = pPhilter;
	}

	public void setSpell(Spell pSpell) {
		spell = pSpell;
	}


}