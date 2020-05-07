package plateau;

import java.util.ArrayList;

/**
 * La classe Board va permettre la création des cases du plateau ainsi que l'affichage de ce plateau.
 * 
 * @author jonathanmrn
 *
 */

public class Board extends SkillCase {

 /**
  * Mon ArrayList n'ayant pas de taille, je choisi d'en définir une avec la constante TAB_SIZE
  * 
  */
	public static final int TAB_SIZE = 15;

	/**
	 * printCase va permettre d'afficher chaque case créé
	 * @param cases
	 * 		La ArrayList cases
	 */
	public void printCase(ArrayList<String> cases) {
		for(int i = 0; i < cases.size(); i++) {
			System.out.println(cases.get(i));
		}
	}

	/**
	 * createCases est une méthode permettant de créer les cases de mon jeu 
	 * @return
	 * 		elle retourne une ArrayList de String nommée cases.
	 */
	public ArrayList<String> createCases() {
		
		/**
		 * création de mon ArrayList dans ma variable cases 
		 */
		ArrayList<String> cases = new ArrayList<String>();

		/**
		 * boucle for permettant la création de chacune des cases de mon jeu, de manière aléatoire.
		 */
		for(int i = 0; i < TAB_SIZE; i++) {
			
			int random = (int) (Math.random()*(3));
			
			if(random == 1) {
				cases.add(createSkill());
			}else if (random == 2) {
				cases.add("ennemi");
			} else {
				cases.add("vide");
			}
			
		}
		
		return cases;
	}

}
