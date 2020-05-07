package plateau;

import java.util.ArrayList;

public class Main {
	//point d'entrée de mon jeu
	public static void main(String[] args) {
	// j'instancie mon plateau de jeu
	Board newBoard = new Board();
	// je fais appel à ma méthode createCases 
	ArrayList<String> createCases = newBoard.createCases();
	// je fais appel à ma méthode printCase, avec en paramètre ma variable createCases précedemment créé afin de pouvoir afficher mes résultats
	newBoard.printCase(createCases);
	}
}
