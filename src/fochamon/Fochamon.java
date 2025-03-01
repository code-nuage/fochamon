package fochamon;

public class Fochamon {
	private String name;
	private Type[] types;
	private Attack[] attacks;
	private Status status;
	private int maxHp;
	private int currentHp;
	private int attackValue;
	private int specialAttackValue;
	private int defenseValue;
	private int specialDefenseValue;
	
	public Fochamon(
			String name,
			int maxHp,
			int attackValue,
			int specialAttackValue,
			int defenseValue,
			int specialDefenseValue) {
		this.name = name;
		this.maxHp = maxHp;
		this.currentHp = maxHp;
		this.attackValue = attackValue;
		this.specialAttackValue = specialAttackValue;
		this.defenseValue = defenseValue;
		this.specialDefenseValue = specialDefenseValue;
	};
	
	public String getName() {
		return this.name;
	}
	
	public Type[] getTypes() {
		return this.types;
	}
	
	public Attack[] getAttacks() {
		return this.attacks;
	}
	
	public Status getStatus() {
		return this.status;
	}
	
	public String toString() {
		return "Name: " + this.name + 
				"\nHP: " + this.currentHp + "/" + this.maxHp +
				"\nATK: " + this.attackValue +
				"\nSPCL ATK: " + this.specialAttackValue +
				"\nDFS: " + this.defenseValue +
				"\nSPCL DFS: " + this.specialDefenseValue;
	};
}
