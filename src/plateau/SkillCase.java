package plateau;

public class SkillCase {


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