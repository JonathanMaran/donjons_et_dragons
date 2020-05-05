package donjons_et_dragons;

public class Stuff {
	
	protected String name;
	protected int attackForce;
	
	public Stuff(String scName, int scAttackForce) {
		this.name = scName;
		this.attackForce = scAttackForce;
	}
	
	public String toString() {
		return name + " " + attackForce;
	}
	
	// ********** getters **********
	
	public int getAttackForce() {
		return attackForce;
	}

	public String getName() {
		return name;
	}

	// ********** setters **********

	public void setName(String pName) {
		name = pName;
	}

	public void setAttackForce(Integer pAttackForce) {
		attackForce = pAttackForce;
	}

}