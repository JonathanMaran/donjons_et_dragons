package donjons_et_dragons;

import java.util.*;


public class Game {

	//point d'entrée de l'application
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un personnage... Vous êtes plus 'Guerrier' ou 'Magicien' ? : ");
		String characterType = sc.nextLine();

		while(!characterType.equalsIgnoreCase("Guerrier") && !characterType.equalsIgnoreCase("Magicien")) {
			System.out.println("Aie ! Vous devez choisir un personnage disponible entre 'Guerrier' et 'Magicien' ! : ");
			characterType = sc.nextLine();
		}

		System.out.println("Vous avez choisi d'incarner un " + characterType + " !");

		if(characterType.equalsIgnoreCase("Guerrier")) {
			createWarrior(sc);
			
		} else {
			
			Magician magician = new Magician(); 
			
		}


	}

	
	
	private static void createWarrior(Scanner sc) {
		Warrior warrior = new Warrior();
		//choix du nom
		System.out.println("Maintenant, il va falloir choisir votre nom : ");
		warrior.name = sc.nextLine();
		System.out.println("Sympa " + warrior.name + " comme nom !");

		//choix du niveau de vie
		System.out.println(warrior.name + ", vous allez devoir établir votre niveau de vie, qui se situera obligatoirement entre 5 et 10 : ");
		warrior.healthPoints = sc.nextInt();
		while(warrior.healthPoints < 5 || warrior.healthPoints > 10 ) {
			System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 5 et 10 : ");
			warrior.healthPoints = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Votre niveau de vie est donc de " + warrior.healthPoints + " !");

		//choisir force attaque 
		System.out.println("C'est bien beau d'avoir des points de vie, mais il va falloir se battre ! choisissez votre force d'attaque, entre 5 et 10 : ");
		warrior.attackForce = sc.nextInt();
		while(warrior.attackForce < 5 || warrior.attackForce > 10) {
			System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 5 et 10 : ");
			warrior.attackForce = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Très bien, partons sur " + warrior.attackForce + " en force d'attaque !");
		
		// vide la lignesans demande de saisie (à faire après un nextInt)
		sc.nextLine();
		
		//choisir son arme
		Weapon weapon = new Weapon();
		System.out.println("J'ai confiance en votre force, mais une arme vous sera très utile ! choisissez un nom d'arme: ");
		weapon.weaponName = sc.nextLine();
		System.out.println(weapon.weaponName + " c'est un super nom d'arme ! et que dire de sa puissance estimé à " + weapon.weaponAttackForce + " !");
		
		//choisir son bouclier
		System.out.println("Pour finir, il vous faudra un bouclier, choisissez son nom:");
		warrior.shield = sc.nextLine();
		System.out.println(warrior.shield + ", c'est PARFAIT ! Vous voilà prêt à partir au combat !");
	}
}