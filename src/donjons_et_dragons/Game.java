package donjons_et_dragons;

import java.util.*;

public class Game {

	//point d'entrée de l'application
	public static void main(String[] args) {

		// variable permettant de rester dans la boucle de création de perso
		String createNewCharacter = "oui";
		Character charTab[] = new Character[10];

		int counterChar = 0;

		while(createNewCharacter.equalsIgnoreCase("oui")) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un personnage... Vous êtes plus 'Guerrier' ou 'Magicien' ? : ");
			String characterType = sc.nextLine();

			while(!characterType.equalsIgnoreCase("Guerrier") && !characterType.equalsIgnoreCase("Magicien")) {
				System.out.println("Aie ! Vous devez choisir un personnage disponible entre 'Guerrier' et 'Magicien' ! : ");
				characterType = sc.nextLine();
			}

			System.out.println("Vous avez choisi d'incarner un " + characterType + " !");
			System.out.println(" ");

			if(characterType.equalsIgnoreCase("Guerrier")) {

				Warrior newWarrior = createWarrior(sc);

				System.out.println(" ");
				System.out.println("Souhaitez-vous enregistrer votre personnage ? oui / non: ");
				String saveChar = sc.nextLine();
				if(saveChar.equalsIgnoreCase("oui") && characterType.equalsIgnoreCase("Guerrier")) {

					charTab[counterChar] = newWarrior;

					counterChar++;
				}
				
				/*for(int i = 0; i < charTab.length; i++) {
					System.out.println(charTab[i]);
				}*/
				
				//counter va pouvoir déterminer le nombre de personnages, qui ont été créé,à afficher
				int counterPrint = 0; 
				while(counterPrint < counterChar ) {
					System.out.println(charTab[counterPrint]);
					counterPrint++;
				}

			} else {

				Magician newMagician = createMagician(sc);

				System.out.println(" ");
				System.out.println("Souhaitez-vous enregistrer votre personnage ? oui / non: ");
				String saveChar = sc.nextLine();
				if(saveChar.equalsIgnoreCase("oui") && characterType.equalsIgnoreCase("Magicien")) {

					charTab[counterChar] = newMagician;

					counterChar++;
				}

				//counter va pouvoir déterminer le nombre de personnages, qui ont été créé,à afficher
				int counterPrint = 0; 
				while(counterPrint < counterChar ) {
					System.out.println(charTab[counterPrint]);
					counterPrint++;
				}
				// ou comme cela pour instancier
				//new Game().createMagician(sc);

			}


			//question recréation perso
			System.out.println(" ");
			System.out.println("******************************************");

			System.out.println(" ");
			System.out.println("Souhaitez-vous créer un nouveau personnage ? oui / non: ");
			createNewCharacter = sc.nextLine();
		}
		
		System.out.println(" ");
		System.out.println("******************************************");
		System.out.println("FIN DU JEU");
		System.out.println("******************************************");
	}

	private static Magician createMagician(Scanner sc) {

		//choix du nom
		System.out.println("Maintenant, il va falloir choisir votre nom : ");
		String scName = sc.nextLine();
		System.out.println(" ");

		System.out.println("Sympa " + scName + " comme nom !");
		System.out.println(" ");

		//choix de l'image
		System.out.println("Choisissez un nom d'image: ");
		String scImg = sc.nextLine();
		System.out.println(" ");

		System.out.println("Votre nom d'image est donc: " + scImg);
		System.out.println(" ");

		//choix du niveau de vie
		System.out.println(scName + ", vous allez devoir établir votre niveau de vie, qui se situera obligatoirement entre 3 et 6 : ");
		Integer scHealthPoints = sc.nextInt();
		while(scHealthPoints < 3 || scHealthPoints > 6 ) {
			System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 3 et 6 : ");
			scHealthPoints = sc.nextInt();
		}
		System.out.println("Votre niveau de vie est donc de " + scHealthPoints + " !");
		System.out.println(" ");

		//choisir force attaque 
		System.out.println("C'est bien beau d'avoir des points de vie, mais il va falloir se battre ! choisissez votre force d'attaque, entre 8 et 15 : ");
		Integer scAttackForce = sc.nextInt();
		while(scAttackForce < 8 || scAttackForce > 15) {
			System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 8 et 15 : ");
			scAttackForce = sc.nextInt();
		}
		System.out.println("Très bien, partons sur " + scAttackForce + " en force d'attaque !");
		System.out.println(" ");

		// vide la lignesans demande de saisie (à faire après un nextInt)
		sc.nextLine();

		//choisir son sort
		System.out.println("J'ai confiance en votre force, mais un sort vous sera très utile ! choisissez un nom de sort: ");
		String scSpellName = sc.next();
		System.out.println("Choisissez sa puissance: ");
		Integer scSpellAttackForce = sc.nextInt();
		System.out.println(scSpellName + " c'est un super nom de sort ! et que dire de sa puissance estimée à " + scSpellAttackForce + " !");
		System.out.println(" ");
		sc.nextLine();


		//choisir son philtre
		System.out.println("Pour finir, il vous faudra un philtre, choisissez son nom:");
		String scPhilter = sc.nextLine();
		System.out.println(scPhilter + ", c'est PARFAIT ! Vous voilà prêt à partir au combat !");

		Magician magician = new Magician(scName, scImg, scHealthPoints, scAttackForce, scPhilter, scSpellName, scSpellAttackForce); 

		System.out.println(" ");

		System.out.println("Souhaitez-vous afficher votre personnage créé ? oui / non: ");
		String getPlayer = sc.nextLine();
		if(getPlayer.equalsIgnoreCase("oui")) {
			System.out.println(" ");
			System.out.println("Nom: " + magician.getName());
			System.out.println("Nom de l'image: " + magician.getImg());
			System.out.println("Points de vie: " + magician.getHealthPoints());
			System.out.println("Force d'attaque: " + magician.getAttackForce());
			System.out.println("Nom du philtre: " + magician.getPhilter());
			System.out.println("Nom du sort et sa force: " + magician.getSpell());

			System.out.println(" ");

			System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
			String setPlayer = sc.nextLine();
			if(setPlayer.equalsIgnoreCase("oui")) {
				System.out.println(" ");
				System.out.println("Par ici les modifications !");
				System.out.println(" ");
				System.out.println("Nouveau nom:");
				magician.setName(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveau nom d'image:");
				magician.setImg(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveaux points de vie entre 3 et 6:");
				magician.setHealthPoints(sc.nextInt());
				System.out.println(" ");
				while(magician.getHealthPoints() < 3 || magician.getHealthPoints() > 6 ) {
					System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 3 et 6 : ");
					magician.setHealthPoints(sc.nextInt());
					System.out.println(" ");
				}
				System.out.println("Nouvelle force d'attaque entre 8 et 15:");
				magician.setAttackForce(sc.nextInt());
				System.out.println(" ");
				while(magician.getAttackForce() < 8 || magician.getAttackForce() > 15 ) {
					System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 8 et 15 : ");
					magician.setAttackForce(sc.nextInt());
					System.out.println(" ");
				}
				sc.nextLine();
				System.out.println("Nouveau nom de philtre:");
				magician.setPhilter(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouveau nom de sort:");
				magician.spell.setName(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouvelle puissance du sort:");
				magician.spell.setAttackForce(sc.nextInt());
				System.out.println(" ");

				System.out.println("Voici votre nouveau personnage mis à jour:");
				System.out.println(" ");
				System.out.println("Nom: " + magician.getName());
				System.out.println("Nom de l'image: " + magician.getImg());
				System.out.println("Points de vie: " + magician.getHealthPoints());
				System.out.println("Force d'attaque: " + magician.getAttackForce());
				System.out.println("Nom du philtre: " + magician.getPhilter());
				System.out.println("Nom du sort et sa force: " + magician.getSpell());
			}
		} else if(getPlayer.equalsIgnoreCase("non")){
			System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
			String setPlayer = sc.nextLine();
			if(setPlayer.equalsIgnoreCase("oui")) {
				System.out.println(" ");
				System.out.println("Par ici les modifications !");
				System.out.println(" ");
				System.out.println("Nouveau nom:");
				magician.setName(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveau nom d'image:");
				magician.setImg(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveaux points de vie entre 3 et 6:");
				magician.setHealthPoints(sc.nextInt());
				System.out.println(" ");
				while(magician.getHealthPoints() < 3 || magician.getHealthPoints() > 6 ) {
					System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 3 et 6 : ");
					magician.setHealthPoints(sc.nextInt());
					System.out.println(" ");
				}
				System.out.println("Nouvelle force d'attaque entre 8 et 15:");
				magician.setAttackForce(sc.nextInt());
				System.out.println(" ");
				while(magician.getAttackForce() < 8 || magician.getAttackForce() > 15 ) {
					System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 8 et 15 : ");
					magician.setAttackForce(sc.nextInt());
					System.out.println(" ");
				}
				sc.nextLine();
				System.out.println("Nouveau nom de philtre:");
				magician.setPhilter(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouveau nom de sort:");
				magician.spell.setName(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouvelle puissance du sort:");
				magician.spell.setAttackForce(sc.nextInt());
				System.out.println(" ");

				System.out.println("Voici votre nouveau personnage mis à jour:");
				System.out.println(" ");
				System.out.println("Nom: " + magician.getName());
				System.out.println("Nom de l'image: " + magician.getImg());
				System.out.println("Points de vie: " + magician.getHealthPoints());
				System.out.println("Force d'attaque: " + magician.getAttackForce());
				System.out.println("Nom du philtre: " + magician.getPhilter());
				System.out.println("Nom du sort et sa force: " + magician.getSpell());
			} 

		}
		
		return magician;
		
	}





	private static Warrior createWarrior(Scanner sc) {

		//choix du nom
		System.out.println("Maintenant, il va falloir choisir votre nom : ");
		String scName = sc.nextLine();
		System.out.println(" ");

		System.out.println("Sympa " + scName + " comme nom !");
		System.out.println(" ");

		//choix de l'image
		System.out.println("Choisissez un nom d'image: ");
		String scImg = sc.nextLine();
		System.out.println(" ");

		System.out.println("Votre nom d'image est donc: " + scImg);
		System.out.println(" ");

		//choix du niveau de vie
		System.out.println(scName + ", vous allez devoir établir votre niveau de vie, qui se situera obligatoirement entre 5 et 10 : ");
		Integer scHealthPoints = sc.nextInt();
		while(scHealthPoints < 5 || scHealthPoints > 10 ) {
			System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 5 et 10 : ");
			scHealthPoints = sc.nextInt();
		}
		System.out.println("Votre niveau de vie est donc de " + scHealthPoints + " !");
		System.out.println(" ");

		//choisir force attaque 
		System.out.println("C'est bien beau d'avoir des points de vie, mais il va falloir se battre ! choisissez votre force d'attaque, entre 5 et 10 : ");
		Integer scAttackForce = sc.nextInt();
		while(scAttackForce < 5 || scAttackForce > 10) {
			System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 5 et 10 : ");
			scAttackForce = sc.nextInt();
		}
		System.out.println("Très bien, partons sur " + scAttackForce + " en force d'attaque !");
		System.out.println(" ");

		// vide la lignesans demande de saisie (à faire après un nextInt)
		sc.nextLine();

		//choisir son arme
		System.out.println("J'ai confiance en votre force, mais une arme vous sera très utile ! choisissez un nom d'arme: ");
		String scWeaponName = sc.next();
		System.out.println("Choisissez sa puissance: ");
		Integer scWeaponAttackForce = sc.nextInt();
		System.out.println(scWeaponName + " c'est un super nom d'arme ! et que dire de sa puissance estimée à " + scWeaponAttackForce + " !");
		System.out.println(" ");
		sc.nextLine();


		//choisir son bouclier
		System.out.println("Pour finir, il vous faudra un bouclier, choisissez son nom:");
		String scShield = sc.nextLine();
		System.out.println(scShield + ", c'est PARFAIT ! Vous voilà prêt à partir au combat !");

		Warrior warrior = new Warrior(scName, scImg, scHealthPoints, scAttackForce, scShield, scWeaponName, scWeaponAttackForce); 

		System.out.println(" ");

		System.out.println("Souhaitez-vous afficher votre personnage créé ? oui / non: ");
		String getPlayer = sc.nextLine();
		if(getPlayer.equalsIgnoreCase("oui")) {
			System.out.println(" ");
			System.out.println("Nom: " + warrior.getName());
			System.out.println("Nom de l'image: " + warrior.getImg());
			System.out.println("Points de vie: " + warrior.getHealthPoints());
			System.out.println("Force d'attaque: " + warrior.getAttackForce());
			System.out.println("Nom du bouclier: " + warrior.getShield());
			System.out.println("Nom de l'arme et sa force: " + warrior.getWeapon());

			System.out.println(" ");

			System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
			String setPlayer = sc.nextLine();
			if(setPlayer.equalsIgnoreCase("oui")) {
				System.out.println(" ");
				System.out.println("Par ici les modifications !");
				System.out.println(" ");
				System.out.println("Nouveau nom:");
				warrior.setName(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveau nom d'image:");
				warrior.setImg(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveaux points de vie entre 5 et 10:");
				warrior.setHealthPoints(sc.nextInt());
				System.out.println(" ");
				while(warrior.getHealthPoints() < 5 || warrior.getHealthPoints() > 10 ) {
					System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 5 et 10 : ");
					warrior.setHealthPoints(sc.nextInt());
					System.out.println(" ");
				}
				System.out.println("Nouvelle force d'attaque entre 5 et 10:");
				warrior.setAttackForce(sc.nextInt());
				System.out.println(" ");
				while(warrior.getAttackForce() < 5 || warrior.getAttackForce() > 10 ) {
					System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 5 et 10 : ");
					warrior.setAttackForce(sc.nextInt());
					System.out.println(" ");
				}
				sc.nextLine();
				System.out.println("Nouveau nom de bouclier:");
				warrior.setShield(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouveau nom d'arme:");
				warrior.weapon.setName(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouvelle puissance du sort:");
				warrior.weapon.setAttackForce(sc.nextInt());
				System.out.println(" ");

				System.out.println("Voici votre nouveau personnage mis à jour:");
				System.out.println(" ");
				System.out.println("Nom: " + warrior.getName());
				System.out.println("Nom de l'image: " + warrior.getImg());
				System.out.println("Points de vie: " + warrior.getHealthPoints());
				System.out.println("Force d'attaque: " + warrior.getAttackForce());
				System.out.println("Nom du bouclier: " + warrior.getShield());
				System.out.println("Nom d'arme et sa force: " + warrior.getWeapon());
			}
		} else if(getPlayer.equalsIgnoreCase("non")){
			System.out.println("Souhaitez-vous modifier votre personnage ? oui / non:");
			String setPlayer = sc.nextLine();
			if(setPlayer.equalsIgnoreCase("oui")) {
				System.out.println(" ");
				System.out.println("Par ici les modifications !");
				System.out.println(" ");
				System.out.println("Nouveau nom:");
				warrior.setName(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveau nom d'image:");
				warrior.setImg(sc.nextLine());  
				System.out.println(" ");
				System.out.println("Nouveaux points de vie entre 5 et 10:");
				warrior.setHealthPoints(sc.nextInt());
				System.out.println(" ");
				while(warrior.getHealthPoints() < 5 || warrior.getHealthPoints() > 10 ) {
					System.out.println("Euh non, veuillez choisir le niveau de vie de votre personnage, entre 5 et 10 : ");
					warrior.setHealthPoints(sc.nextInt());
					System.out.println(" ");
				}
				System.out.println("Nouvelle force d'attaque entre 5 et 10:");
				warrior.setAttackForce(sc.nextInt());
				System.out.println(" ");
				while(warrior.getAttackForce() < 5 || warrior.getAttackForce() > 10 ) {
					System.out.println("Bien tenté mais non...Veuillez choisir la force d'attaque de votre personnage entre 5 et 10 : ");
					warrior.setAttackForce(sc.nextInt());
					System.out.println(" ");
				}
				sc.nextLine();
				System.out.println("Nouveau nom du bouclier:");
				warrior.setShield(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouveau nom d'arme:");
				warrior.weapon.setName(sc.nextLine());
				System.out.println(" ");
				System.out.println("Nouvelle puissance de l'arme:");
				warrior.weapon.setAttackForce(sc.nextInt());
				System.out.println(" ");

				System.out.println("Voici votre nouveau personnage mis à jour:");
				System.out.println(" ");
				System.out.println("Nom: " + warrior.getName());
				System.out.println("Nom de l'image: " + warrior.getImg());
				System.out.println("Points de vie: " + warrior.getHealthPoints());
				System.out.println("Force d'attaque: " + warrior.getAttackForce());
				System.out.println("Nom du bouclier: " + warrior.getShield());
				System.out.println("Nom de l'arme et sa force: " + warrior.getWeapon());

			} 
		}
		return warrior;
	}
}

