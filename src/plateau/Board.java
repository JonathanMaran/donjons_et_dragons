package plateau;

import java.util.ArrayList;

public class Board extends SkillCase {

	//permet de puvoir par la suite définir la taille de mon ArrayList
	public static final int TAB_SIZE = 15;

	//permet d'afficher chaque case créé
	public void printCase(ArrayList<String> cases) {
		for(int i = 0; i < cases.size(); i++) {
			System.out.println(cases.get(i));
		}
	}

	// méthoe permettant de créer mes cases 
	public ArrayList<String> createCases() {
		
		// création de mon arraylist dans ma variable cases
		ArrayList<String> cases = new ArrayList<String>();

		// boucle permettant la création de chacune des cases de mon jeu, de manière aléatoire selon 3 critères 
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
