package plateau;

import java.util.ArrayList;

public class Board {

	//permet de puvoir par la suite définir la taille de mon ArrayList
	public static final int TAB_SIZE = 15;

	public void printCase(ArrayList<String> cases) {
		for(int i = 0; i < cases.size(); i++) {
			System.out.println(cases.get(i));
		}
	}

	
	public ArrayList<String> createCases() {
		
		ArrayList<String> cases = new ArrayList<String>();

		

		for(int i = 0; i < TAB_SIZE; i++) {
			
			int random = (int) (Math.random()*(3));
			
			if(random == 1) {
				cases.add("trésor");
			}else if (random == 2) {
				cases.add("ennemi");

			} else {
				cases.add("vide");
			}
			
		}
		return cases;
	}

}
