package donjons_et_dragons;

public class Warrior extends Character  {

	private String shield;
	Weapon weapon;

	//constructeur (new)
	public Warrior(String scName, String scImg, Integer scHealthPoints, Integer scAttackForce, String scShield, String scWeaponName, Integer scWeaponAttackForce) {
		super(scName, scImg, scHealthPoints, scAttackForce);
		this.shield = scShield;
		this.weapon = new Weapon(scWeaponName, scWeaponAttackForce) ;

	}

	public String toString() {
		return super.toString() + ", Nom du Bouclier: " + shield+ ", puis l'arme et sa force: " + weapon;
	}

	// ********** getters **********

	public String getShield() {
		return shield;
	}

	//retourne l'objet Weapon
	public Weapon getWeapon() {
		return weapon;
	}

	// ********** setters **********

	public void setShield(String pShield) {
		shield = pShield;
	}

	public void setWeapon(Weapon pWeapon) {
		weapon = pWeapon;
	}


}