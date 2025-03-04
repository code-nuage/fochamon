package fochamon;

public abstract class Status {
	private String name;
	private String description;
	
	public Status(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void applyEffect(Fochamon f) {
		System.out.println(f + " " + this.description);
		this.applySpecialEffect();
	};
	
	public String toString() {
		return "Name: " + this.name + "\nDescription: Fochamon " + this.description;
	}
	
	public abstract void applySpecialEffect();
}
