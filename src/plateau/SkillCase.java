package plateau;

/**
 * La classe SkillCase va permettre de pouvoir générer des attributs à mes cases, 
 * améliorant ainsi les compétences de mon personnage.
 * @author jonathanmrn
 *
 */

public class SkillCase {

/** 
 * Création de la méthode createSkill
 * @return
 * 		elle retourne une variable skillCase comportant l'amélioration qui sera choisie
 * 		de manière aléatoire
 */		
	public String createSkill() {

		String skillCase = null;

		int random = (int) (Math.random()*(2));

		if(random == 1) {
			skillCase = "Equipement warrior: massue (attaque +3)";
		}else {
			skillCase = "Equipement warrior: épée (attaque +5)";		
		}

		return skillCase;
	}
	
}