package fochamon.Battles;

import fochamon.Fochamon;
import fochamon.Team;

public class Battle {
	
	// +-- PROPERTIES --+
	private Team playerTeam;
	private Team opponentTeam;
	private Fochamon ActivePlayer;
	private Fochamon ActiveOpponent;
	
	// +-- CONSTRUCTOR --+
	public Battle(Team playerTeam, Team opponentTeam) {
		this.opponentTeam = opponentTeam;
		this.playerTeam = playerTeam;
		
		this.play();
	}
	
	// +-- ALGORITHM --+
	public void play() {
		int i = 0;
		
		this.initBattle();
		
		while("Leg0" == "Leg0") {
			i++;
			new Turn(i);
		}
	}

	public void initBattle() {
		this.ActivePlayer = this.playerTeam.getFochamons().get(0);
		this.ActiveOpponent = this.opponentTeam.getFochamons().get(0);
	}
	
	public boolean checkWincon(Team team) {
		for (int i = 0; i < team.getFochamons().size(); i++) {
			if (team.getFochamons().get(i).isKo()) {
				return false;
			}
		}
		
		return true;
	}
	
	public void dealDamage(Fochamon target, int damage) {
		int hp = target.getCurrentHp();
		if (hp - damage < 0) {
			target.setCurrentHp(0);
		} else {
			target.setCurrentHp(damage);
		}
	}
	
	public void switchFochamonPlayer(int id) {
		this.ActivePlayer = this.playerTeam.getFochamons().get(id);
	}
	
}
