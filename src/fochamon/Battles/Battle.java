package fochamon.Battles;

import java.util.Random;
import fochamon.Attack;
import fochamon.Fochamon;
import fochamon.Team;

public class Battle {
	
	// +-- PROPERTIES --+
	private Team playerTeam;
	private Team opponentTeam;
	private Fochamon activePlayer;
	private Fochamon activeOpponent;
	
	// +-- CONSTRUCTOR --+
	public Battle(Team playerTeam, Team opponentTeam) {
		this.opponentTeam = opponentTeam;
		this.playerTeam = playerTeam;
		
		this.play();
	}
	
	// +-- GETTERS --+
	public Team getPlayerTeam() {
		return playerTeam;
	}
	
	public Team getOpponentTeam() {
		return opponentTeam;
	}
	
	public Fochamon getActivePlayer() {
		return activePlayer;
	}
	
	public Fochamon getActiveOpponent() {
		return activeOpponent;
	}
	
	// +-- ALGORITHM --+
	public void play() {
		int i = 0;
		
		this.initBattle();
		
		while("Leg0" == "Leg0") {
			i++;
			if (this.activePlayer.isKo()) {
				this.forceSwitch(activeOpponent);
			}
			new Turn(i, this);
		}
	}

	public void initBattle() {
		this.activePlayer = this.playerTeam.getFochamons().get(0);
		this.activeOpponent = this.opponentTeam.getFochamons().get(0);
	}
	
	public boolean checkWincon(Team team) {
		for (int i = 0; i < team.getFochamons().size(); i++) {
			if (team.getFochamons().get(i).isKo()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkSpeed() {
		int rand;
		if (this.activePlayer.getSpeedValue() ==
		this.activeOpponent.getSpeedValue()) {
			rand = new Random().nextInt(2);
			if (rand == 0) {
				return true;
			} else {
				return false;
			}
		} else if (
				this.activePlayer.getSpeedValue() > 
				this.activeOpponent.getSpeedValue()) {
			return true;
		}
		return false;
	}
	
	public void dealDamage(Fochamon target, int damage) {
		int hp = target.getCurrentHp();
		if (hp - damage < 0) {
			target.setCurrentHp(0);
		} else {
			target.setCurrentHp(hp - damage);
		}
	}
	
	public void forceSwitch(Fochamon fochamon) {
	}
	
	public void switchFochamonPlayer(int id) {
		this.activePlayer = this.playerTeam.getFochamons().get(id);
	}
	
	public void switchFochamonOpponent(int id) {
		this.activeOpponent = this.opponentTeam.getFochamons().get(id);
	}
	
	public Attack attackChosenPlayer(int attackId) {
		return this.activePlayer.getAttacks().get(attackId);
	}
	
	public Attack attackChosenOpponent(int attackId) {
		return this.activeOpponent.getAttacks().get(attackId);
	}
}
