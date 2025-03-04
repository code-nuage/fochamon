package fochamon.Types;

import fochamon.Type;

public class Plant extends Type {
	public Plant() {
		super("Plant");
		this
		.addStrength(TypesList.types.get("WATER"))
		.addWeakness(TypesList.types.get("FIRE"));
	}
}
