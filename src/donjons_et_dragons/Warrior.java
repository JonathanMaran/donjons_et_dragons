package donjons_et_dragons;

public class Warrior {
	String name;
	int healthPoints;
	int attackForce;
	String shield;
	Weapon weapon;

	// ********** getters **********

	public String getNameWarrior() {
		return name;
	}

	public int getHealthPointsWarrior() {
		return healthPoints;
	}

	public int getAttackForceWarrior() {
		return attackForce;
	}

	public String getShieldWarrior() {
		return shield;
	}
	
	//retourne l'objet Weapon
	public Weapon getWeaponWarrior() {
		return weapon;
	}

	// ********** setters **********

	public void setNameWarrior(String pName) {
		name = pName;
	}

	public void setHealthPointsWarrior(int pHealthPoints) {
		healthPoints = pHealthPoints;
	}

	public void setAttackForceWarrior(int pAttackForce) {
		attackForce = pAttackForce;
	}

	public void setShieldWarrior(String pShield) {
		shield = pShield;
	}
	
	public void setWeaponWarrior(Weapon pWeapon) {
		weapon = pWeapon;
	}
	
	//constructeur (new)
	public Warrior(String scName, Integer scHealthPoints, Integer scAttackForce, String scShield, String scWeaponName, Integer scWeaponAttackForce) {
		this.name = scName;
		this.healthPoints = scHealthPoints;
		this.attackForce = scAttackForce;
		this.shield = scShield;
		this.weapon = new Weapon(scWeaponName, scWeaponAttackForce) ;
		
	}
}