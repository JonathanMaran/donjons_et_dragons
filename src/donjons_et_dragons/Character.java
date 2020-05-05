package donjons_et_dragons;

public class Character {
	
	protected String name;
	protected String img;
	protected int healthPoints;
	protected int attackForce;

	public Character(String scName, String scImg, Integer scHealthPoints, Integer scAttackForce){
		this.name = scName;
		this.img = scImg;
		this.healthPoints = scHealthPoints;
		this.attackForce = scAttackForce;
	}
	
	public String toString() {
		return "Nom:" + name + ", Nom de l'image: " + img + ", Nombre de points de vie: " + healthPoints+ ", Force d'attaque: " + attackForce;
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


}