package fochamon;

public class Fochamon {
	private String name;
	private Attack[] attacks;
	private Status status;
	private int max_hp;
	private int current_hp;
	private int attack_value;
	private int special_attack_value;
	private int defense_value;
	private int special_defense_value;
	
	public Fochamon(
			String name,
			int max_hp,
			int attack_value,
			int special_attack_value,
			int defense_value,
			int special_defense_value) {
		this.name = name;
		this.max_hp = max_hp;
		this.current_hp = max_hp;
		this.attack_value = attack_value;
		this.special_attack_value = special_attack_value;
		this.defense_value = defense_value;
		this.special_defense_value = special_defense_value;
	};
	
	public String toString() {
		return "Name: " + this.name + 
				"\nHP: " + this.current_hp + "/" + this.max_hp +
				"\nATK: " + this.attack_value +
				"\nSPCL ATK: " + this.special_attack_value +
				"\nDFS: " + this.defense_value +
				"\nSPCL DFS: " + this.special_defense_value;
	};
}
