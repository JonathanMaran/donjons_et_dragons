package donjons_et_dragons;

public class Warrior {
	private String name;
	private String img;
	private int healthPoints;
	private int attackForce;
	private String shield;
	Weapon weapon;
	
	//constructeur (new)
		public Warrior(String scName, String scImg, Integer scHealthPoints, Integer scAttackForce, String scShield, String scWeaponName, Integer scWeaponAttackForce) {
			this.name = scName;
			this.healthPoints = scHealthPoints;
			this.attackForce = scAttackForce;
			this.shield = scShield;
			this.weapon = new Weapon(scWeaponName, scWeaponAttackForce) ;
			
		}

	// ********** getters **********

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

	public String getShield() {
		return shield;
	}
	
	//retourne l'objet Weapon
	public Weapon getWeapon() {
		return weapon;
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

	public void setShield(String pShield) {
		shield = pShield;
	}
	
	public void setWeapon(Weapon pWeapon) {
		weapon = pWeapon;
	}

	
}