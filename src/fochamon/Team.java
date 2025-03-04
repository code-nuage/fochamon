package fochamon;

import java.util.ArrayList;

public class Team {
	// +-- PROPERTIES --+
	private String name;
	private ArrayList<Fochamon> fochamons = new ArrayList<Fochamon>();
	
	// +-- CONSTRUCTOR --+
	public Team(String name) {
		this.name = name;
	}
	
	// +-- SETTERS --+
	public Team addFochamon(Fochamon f) {
		if (this.fochamons.size() < 4) {
			this.fochamons.add(f);
		}
		return this;
	}
	
	public Team removeFochamon(Fochamon f) {
		for (int i = 0; i < this.fochamons.size(); i++) {
			if (this.fochamons.get(i) == f) {
				this.fochamons.remove(i); 
				// .remove() shifts everything after index to the left
			}
		}
		return this;
	}
	
	public Team clear() {
		this.fochamons.clear();
		return this;
	}
	
	// +-- GETTERS --+
	public String getName() { return this.name; }
	
	public ArrayList<Fochamon> getFochamons() { return this.fochamons; }
	
	// +-- STRINGIFY --+
	public String toString() {
		String fochamonslist = fochamonsList(this.fochamons);
		return "Team" +
				"\nFochamons: " + fochamonslist;
	}
	
	// +-- TOOLS --+
	private String fochamonsList(ArrayList<Fochamon> fochamons) {
		String fochamonslist = new String();
		
		for (int i = 0; i < fochamons.size(); i++) {
			fochamonslist += fochamons.get(i).getName() + " ";
		}
		
		return fochamonslist;
	}
}
