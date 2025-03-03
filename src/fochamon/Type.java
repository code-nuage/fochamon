package fochamon;

import java.util.ArrayList;

public class Type {
	private String name;
	private ArrayList<Type> weaknesses;
	private ArrayList<Type> strengths;
	private ArrayList<Type> immunities;
	
	public Type(String name) {
		this.name = name;
	}
	
	public void addWeakness(Type type) {
		this.weaknesses.add(type);
	}
	
	public void addStrength(Type type) {
		this.strengths.add(type);
	}
	
	public void addImmunity(Type type) {
		this.immunities.add(type);
	}
	
	public ArrayList<Type> getWeaknesses() {
		return this.weaknesses;
	}
	
	public ArrayList<Type> getStrengths() {
		return this.weaknesses;
	}
	
	public ArrayList<Type> getImmunities() {
		return this.weaknesses;
	}
	
	public String toString() {
		return this.name;
	}
}
