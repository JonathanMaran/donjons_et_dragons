package plateau;

import java.util.ArrayList;

/**
 * C'est ici que se trouve mon main et donc le déroulement de mon jeu.
 * @author jonathanmrn
 *
 */
public class Main {
	/**
	 * Point d'entrée de mon jeu
	 * @param args
	 */
	public static void main(String[] args) {
	/**
	 * j'instancie mon plateau de jeu
	 */
	Board newBoard = new Board();
	/**
	 * je fais appel à ma méthode createCases 
	 */
	ArrayList<String> createCases = newBoard.createCases();
	/**
	 *  je fais appel à ma méthode printCase, avec en paramètre ma variable createCases précedemment créée afin de pouvoir afficher mes résultats
	 */
	newBoard.printCase(createCases);
	}
}
