package donjons_et_dragons;

public class Weapon {
	private String weaponName;
	private int weaponAttackForce;

	public Weapon(String scWeaponName, Integer scWeaponAttackForce) {
		this.weaponName = scWeaponName;
		this.weaponAttackForce = scWeaponAttackForce;
	}
	
	public String toString() {
		return weaponName + " " + weaponAttackForce;
	}
	
	// ********** getters **********

	public int getAttackForce() {
		return weaponAttackForce;
	}

	public String getName() {
		return weaponName;
	}

	// ********** setters **********
	
	public void setName(String pWeaponName) {
		weaponName = pWeaponName;
	}
	
	public void setAttackForce(Integer pWeaponAttackForce) {
		weaponAttackForce = pWeaponAttackForce;
	}
	
}