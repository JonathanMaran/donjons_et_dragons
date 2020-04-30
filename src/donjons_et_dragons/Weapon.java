package donjons_et_dragons;

public class Weapon {
	String weaponName;
	int weaponAttackForce;

	public Weapon(String scWeaponName, Integer scWeaponAttackForce) {
		this.weaponName = scWeaponName;
		this.weaponAttackForce = scWeaponAttackForce;
	}
	
	public String toString() {
		return weaponName + " " + weaponAttackForce;
	}
	
	// ********** getters **********

	public int getWeaponAttackForce() {
		return weaponAttackForce;
	}

	public String getWeaponName() {
		return weaponName;
	}

	// ********** setters **********
	
	public void setWeaponName(String pWeaponName) {
		weaponName = pWeaponName;
	}
	
	public void setWeaponAttackForce(Integer pWeaponAttackForce) {
		weaponAttackForce = pWeaponAttackForce;
	}
	
}