package fochamon;

import java.util.ArrayList;

public class Team {
	private ArrayList<Fochamon> fochamons;
	
	public Team(ArrayList<Fochamon> fochamons) {
		this.fochamons = fochamons;
	}
	
	public ArrayList<Fochamon> getFochamons() {
		return this.fochamons;
	}
}
