package plateau;

public class EnemieCase {
	
	public String createEnemie() {

		String enemieCase = null;

		int random = (int) (Math.random()*(2));

		if(random == 1) {
			enemieCase = "Equipement warrior: massue (attaque +3)";
		}else if(random == 2){
			enemieCase = "Ennemi possède 6 pdv et une force d'attaque de 3";		
		}else {
			enemieCase = "Ennemi possède 6 pdv et une force d'attaque de 3";
		}

		return enemieCase;
	}
}