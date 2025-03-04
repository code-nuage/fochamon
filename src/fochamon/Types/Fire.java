package fochamon.Types;

import fochamon.Type;

public class Fire extends Type {
	public Fire() {
		super("Fire");
		this
		.addStrength(TypesList.types.get("PLANT"))
		.addWeakness(TypesList.types.get("WATER"));
	}
}
