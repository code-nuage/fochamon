package fochamon;

public abstract class Status {
	private String name;
	
	public Status(String name) {
		this.name = name;
	}
	
	public abstract void applyEffect();
	
	public String toString() {
		return this.name;
	}
	
	public abstract void effect();
}
