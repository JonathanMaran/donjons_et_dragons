package donjons_et_dragons;

public class Warrior {
	String name;
	int healthPoints;
	int attackForce;
	String shield;


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
}