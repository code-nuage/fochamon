package fochamon;

public abstract class Attack {
	// +-- PROPERTIES --+
	private String name;
	private String category;
	private int power;
	private int accuracy;
	private Type type;
	
	// +-- CONSTRUCTOR --+
	public Attack(
			String name,
			String category, 
			int power, 
			int accuracy, 
			Type type) {
		this.accuracy = accuracy;
		this.category = category;
		this.name = name;
		this.power = power;
		this.type = type;
	}
	
	// +-- SETTERS --+
	public Attack setName(String name) {
		this.name = name;
		return this;
	}
	
	public Attack setCategory(String category) {
		this.category = category;
		return this;
	}
	
	public Attack setPower(int power) {
		this.power = power;
		return this;
	}
	
	public Attack setAccuracy(int accuracy) {
		this.accuracy = accuracy;
		return this;
	}
	
	public Attack setType(Type type) {
		this.type = type;
		return this;
	}
	
	// +-- GETTERS --+
	public String getName() { return this.name; }
	
	public String getCategory() { return this.category; }
	
	public int getPower() { return this.power; }
	
	public int getAccuracy() { return this.accuracy; }
	
	public Type getType() { return this.type; }
	
	// +-- STRINGIFIERS --+
	public String toString() {
		return this.name + "\n" +
			   "Category: " + this.category + "\n" +
			   "Power: " + this.power + "\n" +
			   "Accuracy: " + this.accuracy + "\n" +
			   this.type.getName();
		} 
	
	// +-- ALGORITHM --+
	public abstract void effect();
}
