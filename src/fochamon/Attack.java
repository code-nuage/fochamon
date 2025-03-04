package fochamon;

public abstract class Attack {
	private String name;
	private String category;
	private int power;
	private int accuracy;
	private Type type;
	
	public Attack(String name, String category, int power, int accuracy, Type type) {
		this.accuracy = accuracy;
		this.category = category;
		this.name = name;
		this.power = power;
		this.type = type;
	}
	
	public abstract void effect();
	
}
