package fochamon;

import java.util.ArrayList;

public class Fochamon {
	// +-- PROPERTIES --+
	private String name;
	private ArrayList<Type> types = new ArrayList<Type>();
	private ArrayList<Attack> attacks = new ArrayList<Attack>();
	private Status status;
	private int maxHp;
	private int currentHp;
	private int attackValue;
	private int specialAttackValue;
	private int defenseValue;
	private int specialDefenseValue;
	private int speedValue;
	
	// +-- CONSTRUCTOR --+
	public Fochamon(
			String name,
			int maxHp,
			int attackValue,
			int specialAttackValue,
			int defenseValue,
			int specialDefenseValue,
			int speedValue) {
		this.name = name;
		this.maxHp = maxHp;
		this.currentHp = maxHp;
		this.attackValue = attackValue;
		this.specialAttackValue = specialAttackValue;
		this.defenseValue = defenseValue;
		this.specialDefenseValue = specialDefenseValue;
		this.speedValue = speedValue;
	};
	
	// +-- SETTERS --+
	public Fochamon addType(Type type) {
		if (this.types.size() < 2) {
			this.types.add(type);
		}
		return this;
	}
	
	public Fochamon addAttack(Attack attack) {
		if (this.attacks.size() < 4) {
			this.attacks.add(attack);
		}
		return this;
	}
	
	public Fochamon removeAttack(Attack attack) {
		for (int i = 0; i < this.attacks.size(); i++) {
			if (this.attacks.get(i) == attack) {
				this.attacks.remove(i);
				return this;
			}
		}
		return this;
	}
	
	public Fochamon setCurrentHp(int hp) {
		this.currentHp = hp;
		return this;
	}

	// +-- GETTERS --+
	public String getName() { return this.name; }
	
	public ArrayList<Type> getTypes() { return this.types; }
	
	public ArrayList<Attack> getAttacks() { return this.attacks; }
	
	public Status getStatus() { return this.status; }
	
	public int getMaxHp() { return this.maxHp; }
	public int getCurrentHp() { return this.currentHp; }
	
	public int getAttackValue() { return this.attackValue; }
	public int getSpecialAttackValue() { return this.specialAttackValue; }
	
	public int getDefenseValue() { return this.defenseValue; }
	public int getDefenseAttackValue() { return this.specialDefenseValue; }
	
	public int getSpeedValue() { return this.specialDefenseValue; }
	
	// +-- STRINGIFIER --+
	public String toString() {
		String typeslist = this.typesList(this.types);
		String attackslist = this.attacksList(this.types);
		
		return "Name: " + this.name + 
				"\nTypes: " + typeslist +
				"\nAttacks: " + attackslist +
				"\nHP: " + this.currentHp + "/" + this.maxHp +
				"\nATK: " + this.attackValue +
				"\nSPCL ATK: " + this.specialAttackValue +
				"\nDFS: " + this.defenseValue +
				"\nSPCL DFS: " + this.specialDefenseValue +
				"\nSPEED: " + this.speedValue;
	};
	
	// +-- TOOLS --+
	private String typesList(ArrayList<Type> types) {
		String typelist = new String();
		
		for (int i = 0; i < types.size(); i++) {
			typelist += types.get(i).getName() + " ";
		}
		
		return typelist;
	}
	
	private String attacksList(ArrayList<Type> attacks) {
		String attackslist = new String();
		
		for (int i = 0; i < attacks.size(); i++) {
			attackslist += attacks.get(i).getName() + " ";
		}
		
		return attackslist;
	}
	
	// +-- ALGORITHM --+
	public boolean isKo() {
		if (this.getCurrentHp() == 0) {
			return true;
		}
		return false;
	}
}
