package fochamon.Types;

import fochamon.Type;

public class Water extends Type {
	public Water() {
		super("Water");
		this
		.addStrength(new Fire())
		.addWeakness(new Plant());
	}
}
