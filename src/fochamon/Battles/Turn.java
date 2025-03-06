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
	
	// +-- ALGORITHM --+
	public void optionChose(
			boolean playerIsAttacking, 
			boolean opponentIsAttacking) {
		if (playerIsAttacking && opponentIsAttacking) {
			if (battle.checkSpeed()) {
				
			}
		}
	}
}
