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

			createMagician(sc);

		}

		System.out.println("******************************************");

	}



	private static void createMagician(Scanner sc) {

		//choix du nom
		System.out.println("Maintenant, il va falloir choisir votre nom : ");
		String scName = sc.nextLine();
		System.out.println("Sympa " + scName + " comme nom !");

		System.out.println(" ");

		//choix du niveau de vie
		System.out.println(scName + ", vous allez devoir établir votre niveau de vie, qui se situera obligatoirement entre 3 et 6 : ");
		Integer scHealthPoints = sc.nextInt();
		while(scHealthPoints < 3 || scHealthPoints > 6 ) {
			System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 3 et 6 : ");
			scHealthPoints = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Votre niveau de vie est donc de " + scHealthPoints + " !");

		System.out.println(" ");

		//choisir force attaque 
		System.out.println("C'est bien beau d'avoir des points de vie, mais il va falloir se battre ! choisissez votre force d'attaque, entre 8 et 15 : ");
		Integer scAttackForce = sc.nextInt();
		while(scAttackForce < 8 || scAttackForce > 15) {
			System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 8 et 15 : ");
			scAttackForce = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Très bien, partons sur " + scAttackForce + " en force d'attaque !");

		System.out.println(" ");

		// vide la lignesans demande de saisie (à faire après un nextInt)
		sc.nextLine();

		System.out.println(" ");

		//choisir son philtre
		System.out.println("Pour finir, il vous faudra un philtre, choisissez son nom:");
		String scPhilter = sc.nextLine();
		System.out.println(scPhilter + ", c'est PARFAIT ! Vous voilà prêt à partir au combat !");

		//choisir son sort
		System.out.println("J'ai confiance en votre force, mais un sort vous sera très utile ! choisissez un nom de sort: ");
		String scSpellName = sc.next();
		System.out.println("Choisissez sa puissance: ");
		Integer scSpellAttackForce = sc.nextInt();
		//System.out.println(scSpellName + " c'est un super nom de sort ! et que dire de sa puissance estimé à " + scSpellAttackForce + " !");
		//sc.nextLine();

		Magician magician = new Magician(scName, scHealthPoints, scAttackForce, scPhilter, scSpellName, scSpellAttackForce); 

		System.out.println(" ");

		System.out.println("Souhaitez-vous afficher votre personnage créé ? oui / non: ");
		String getPlayer = sc.next();
		System.out.println("Nom: " + magician.getNameMagician());
		System.out.println("Points de vie: " + magician.getHealthPointsMagician());
		System.out.println("Force d'attaque: " + magician.getAttackForceMagician());
		System.out.println("Nom du philtre: " + magician.getPhilterMagician());
		System.out.println("Nom du sort et sa force: " + magician.getSpellMagician());

		System.out.println(" ");

		System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
		String setPlayer = sc.nextLine();
		if(setPlayer.equalsIgnoreCase("oui")) {
			System.out.println("Par ici les modifications !");
			System.out.println("Nouveau nom:");
			magician.setNameMagician(sc.nextLine());                
			System.out.println("Nouveaux points de vie:");
			magician.setHealthPointsMagician(sc.nextInt());
			System.out.println("Nouvelle force d'attaque entre 5 et 10:");
			magician.setAttackForceMagician(sc.nextInt());
			sc.nextLine();
			System.out.println("Nouveau nom de philtre:");
			magician.setPhilterMagician(sc.nextLine());
			System.out.println("Nouveau nom de sort:");
			//magician.getSpellName(sc.nextLine());

			System.out.println(" ");

			System.out.println("Voici votre nouveau personnage mis à jour:");
			System.out.println("Nom: " + magician.getNameMagician());
			System.out.println("Points de vie: " + magician.getHealthPointsMagician());
			System.out.println("Force d'attaque: " + magician.getAttackForceMagician());
			System.out.println("Nom du philtre: " + magician.getPhilterMagician());
			//System.out.println("Nom du sort et sa force: " + spell.getSpellName() + " " + spell.getSpellAttackForce());
		} else {

		}
		System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
		String setPlayer = sc.nextLine();
		if(setPlayer.equalsIgnoreCase("oui")) {
			System.out.println("Par ici les modifications !");
			System.out.println("Nouveau nom:");
			magician.setNameMagician(sc.nextLine());                
			System.out.println("Nouveaux points de vie:");
			magician.setHealthPointsMagician(sc.nextInt());
			System.out.println("Nouvelle force d'attaque entre 5 et 10:");
			magician.setAttackForceMagician(sc.nextInt());
			sc.nextLine();
			System.out.println("Nouveau nom de philtre:");
			magician.setPhilterMagician(sc.nextLine());
			System.out.println("Nouveau nom de sort:");
			//spell.setSpellName(sc.nextLine());

			System.out.println(" ");

			System.out.println("Voici votre nouveau personnage mis à jour:");
			System.out.println("Nom: " + magician.getNameMagician());
			System.out.println("Points de vie: " + magician.getHealthPointsMagician());
			System.out.println("Force d'attaque: " + magician.getAttackForceMagician());
			System.out.println("Nom du philtre: " + magician.getPhilterMagician());
			//System.out.println("Nom du sort et sa force: " + spell.getSpellName() + " " + spell.getSpellAttackForce());
		}
	}




	private static void createWarrior(Scanner sc) {
		Warrior warrior = new Warrior();
		//choix du nom
		System.out.println("Maintenant, il va falloir choisir votre nom : ");
		warrior.name = sc.nextLine();
		System.out.println("Sympa " + warrior.name + " comme nom !");

		System.out.println(" ");

		//choix du niveau de vie
		System.out.println(warrior.name + ", vous allez devoir établir votre niveau de vie, qui se situera obligatoirement entre 5 et 10 : ");
		warrior.healthPoints = sc.nextInt();
		while(warrior.healthPoints < 5 || warrior.healthPoints > 10 ) {
			System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 5 et 10 : ");
			warrior.healthPoints = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Votre niveau de vie est donc de " + warrior.healthPoints + " !");

		System.out.println(" ");

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

		System.out.println(" ");

		//choisir son arme
		Weapon weapon = new Weapon();
		System.out.println("J'ai confiance en votre force, mais une arme vous sera très utile ! choisissez un nom d'arme: ");
		weapon.weaponName = sc.nextLine();
		System.out.println(weapon.weaponName + " c'est un super nom d'arme ! et que dire de sa puissance estimé à " + weapon.weaponAttackForce + " !");

		System.out.println(" ");

		//choisir son bouclier
		System.out.println("Pour finir, il vous faudra un bouclier, choisissez son nom:");
		warrior.shield = sc.nextLine();
		System.out.println(warrior.shield + ", c'est PARFAIT ! Vous voilà prêt à partir au combat !");

		System.out.println(" ");

		System.out.println("Souhaitez-vous afficher votre personnage créé ? oui / non: ");
		String getPlayer = sc.nextLine();
		if(getPlayer.equals("oui")) {
			System.out.println("Nom: " + warrior.getNameWarrior());
			System.out.println("Points de vie: " + warrior.getHealthPointsWarrior());
			System.out.println("Force d'attaque: " + warrior.getAttackForceWarrior());
			System.out.println("Nom du bouclier: " + warrior.getShieldWarrior());
			System.out.println("Nom de l'arme et sa force: " + weapon.getWeaponName() + " " + weapon.getWeaponAttackForce());

			System.out.println(" ");

			System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
			String setPlayer = sc.nextLine();
			if(setPlayer.equalsIgnoreCase("oui")) {
				System.out.println("Par ici les modifications !");
				System.out.println("Nouveau nom:");
				warrior.setNameWarrior(sc.nextLine());                
				System.out.println("Nouveaux points de vie:");
				warrior.setHealthPointsWarrior(sc.nextInt());
				System.out.println("Nouvelle force d'attaque entre 5 et 10:");
				warrior.setAttackForceWarrior(sc.nextInt());
				sc.nextLine();
				System.out.println("Nouveau nom de bouclier:");
				warrior.setShieldWarrior(sc.nextLine());
				System.out.println("Nouveau nom d'arme:");
				weapon.setWeaponName(sc.nextLine());

				System.out.println(" ");

				System.out.println("Voici votre nouveau personnage mis à jour:");
				System.out.println("Nom: " + warrior.getNameWarrior());
				System.out.println("Points de vie: " + warrior.getHealthPointsWarrior());
				System.out.println("Force d'attaque: " + warrior.getAttackForceWarrior());
				System.out.println("Nom du bouclier: " + warrior.getShieldWarrior());
				System.out.println("Nom de l'arme et sa force: " + weapon.getWeaponName() + " " + weapon.getWeaponAttackForce());
			}

		} else {
			System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
			String setPlayer = sc.nextLine();
			if(setPlayer.equalsIgnoreCase("oui")) {
				System.out.println("Par ici les modifications !");
				System.out.println("Nouveau nom:");
				warrior.setNameWarrior(sc.nextLine());
				System.out.println("Nouveaux points de vie:");
				warrior.setHealthPointsWarrior(sc.nextInt());
				System.out.println("Nouvelle force d'attaque entre 5 et 10:");
				warrior.setAttackForceWarrior(sc.nextInt());
				sc.nextLine();
				System.out.println("Nouveau nom de bouclier:");
				warrior.setShieldWarrior(sc.nextLine());
				System.out.println("Nouveau nom d'arme:");
				weapon.setWeaponName(sc.nextLine());

				System.out.println(" ");

				System.out.println("Voici votre nouveau personnage mis à jour:");
				System.out.println("Nom: " + warrior.getNameWarrior());
				System.out.println("Points de vie: " + warrior.getHealthPointsWarrior());
				System.out.println("Force d'attaque: " + warrior.getAttackForceWarrior());
				System.out.println("Nom du bouclier: " + warrior.getShieldWarrior());
				System.out.println("Nom de l'arme et sa force: " + weapon.getWeaponName() + " " + weapon.getWeaponAttackForce());
			}
		}

	}
}