package fochamon.Attacks;
import fochamon.Attack;
import fochamon.Types.Fire;

public class FochaSphere extends Attack{
	// +-- CONSTRUCTOR --+
	public FochaSphere() {
		super("Focha-sphère", 
				"physique", 
				60, 
				100, 
				"The user lands a strong orb of fire on his opponent",
				new Fire());
	}

	// +-- ALGORYTHM --+
	public void effect() {
	}
}
