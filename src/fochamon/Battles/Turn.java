package fochamon.Battles;

public class Turn {
	// +-- PROPERTIES --+
	private int number;
	private Battle battle;
	
	// +-- CONSTRUCTOR --+
	public Turn(int number, Battle battle) {
		this.number = number;
		this.battle = battle;
	}
	
	// +-- GETTERS --+
	public int getNumber() {
		return this.number;
	}
	
	// +-- ALGORITHM --+
	public void useAttack (int id) {
		
	}
	
	public void optionsChosen(
			boolean playerIsAttacking, 
			boolean opponentIsAttacking) {
		if (playerIsAttacking && opponentIsAttacking) {
			if (battle.checkSpeed()) {
				
			}
		}
	}
}
