package plateau;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	Board newBoard = new Board();
	ArrayList<String> createCases = newBoard.createCases();
	newBoard.printCase(createCases);
	}
}
