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
	
	// +-- ALGORITHM --+
	public double multiplyByType(Type attacker, Type defender) {
		double multiplier = 1;
		
		if (this.isWeak(attacker, defender)) {
			multiplier = multiplier * 0.5;
			return multiplier;
		} else if (this.isStrong(attacker, defender)) {
			multiplier = multiplier * 2;
			return multiplier;
		} else if (this.isImmune(attacker, defender)) {
			multiplier = multiplier * 0;
			return multiplier;
		} else {
			return multiplier;	
		}
	}
	
	public boolean isWeak(Type attacker, Type defender) {
		for (int i = 0; i < defender.getStrengths().size(); i++) {
			if (attacker == defender.getStrengths().get(i)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isStrong(Type attacker, Type defender) {
		for (int i = 0; i < defender.getWeaknesses().size(); i++) {
			if (attacker == defender.getWeaknesses().get(i)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isImmune(Type attacker, Type defender) {
		for (int i = 0; i < defender.getImmunities().size(); i++) {
			if (attacker == defender.getImmunities().get(i)) {
				return true;
			}
		}
		return false;
	}
}
