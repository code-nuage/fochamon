package fochamon;

public abstract class Status {
	// +-- PROPERTIES --+
	private String name;
	private String description;
	
	// +-- CONSTRUCTOR --+
	public Status(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// +-- GETTERS --+
	public String getName() { return this.name; }
	
	public String getDescription() { return this.description; }
	
	// +-- ALGORITHM --+
	public void applyEffect(Fochamon f) {
		System.out.println(f + " " + this.description);
		this.applySpecialEffect();
	};
	
	// +-- STRINGIFIER --+
	public String toString() {
		return "Name: " + this.name +
				"\nDescription: Fochamon " + this.description;
	}
	
	public abstract void applySpecialEffect();
}
