package fochamon.Types;

import fochamon.Type;

public class Water extends Type {
	public Water() {
		super("Water");
		this
		.addStrength(TypesList.types.get("FIRE"))
		.addWeakness(TypesList.types.get("PLANT"));
	}
}
