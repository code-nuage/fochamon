package fochamon;

import java.util.ArrayList;

public class Type {
	// +-- PROPERTIES --+
	private String name;
	private ArrayList<Type> weaknesses = new ArrayList<Type>();
	private ArrayList<Type> strengths = new ArrayList<Type>();
	private ArrayList<Type> immunities = new ArrayList<Type>();
	
	// +-- CONSTRUCTOR --+
	public Type(String name) {
		this.name = name;
	}
	
	// +-- SETTERS --+
	public Type addWeakness(Type type) {
		this.weaknesses.add(type);
		return this;
	}
	
	public Type addStrength(Type type) {
		this.strengths.add(type);
		return this;
	}
	
	public Type addImmunity(Type type) {
		this.immunities.add(type);
		return this;
	}
	
	// +-- GETTERS --+
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Type> getWeaknesses() {
		return this.weaknesses;
	}
	
	public ArrayList<Type> getStrengths() {
		return this.strengths;
	}
	
	public ArrayList<Type> getImmunities() {
		return this.immunities;
	}
	
	// +-- STRINGIFIER --+
	public String toString() {
		String weaknesseslist = this.modifiersList(weaknesses);
		String strengthslist = this.modifiersList(strengths);
		String immunitieslist = this.modifiersList(immunities);
		
		return "Type: " + this.name +
				"\nWeaknesses: " + weaknesseslist +
				"\nStrengths: " + strengthslist +
				"\nImmunities: " + immunitieslist;
	}
	
	// +-- TOOLS --+
	private String modifiersList(ArrayList<Type> modifier) {
		String modifierlist = new String();
		
		for (int i = 0; i < modifier.size(); i++) {
			modifierlist += modifier.get(i).getName() + " ";
		}
		
		return modifierlist;
	}
}
