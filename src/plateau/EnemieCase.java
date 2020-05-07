package plateau;

/**
 * La classe EnemieCase va permettre de pouvoir générer des attributs à mes cases, 
 * ici, la création d'un ennemie avec des attributs particuliers.
 * @author jonathanmrn
 *
 */

public class EnemieCase {
	
	/** 
	 * Création de la méthode createEnemie
	 * @return
	 * 		elle retourne une variable enemieCase comportant les attributs qui seront choisi
	 * 		de manière aléatoire
	 */	
	
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