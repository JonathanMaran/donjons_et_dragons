package donjons_et_dragons;

public class Weapon {
	int weaponAttackForce = 8;
	String weaponName;

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
	
}