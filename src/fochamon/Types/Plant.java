package fochamon.Types;

import fochamon.Type;

public class Plant extends Type {
	public Plant() {
		super("Plant");
		this
		.addStrength(new Water())
		.addWeakness(new Fire());
	}
}
