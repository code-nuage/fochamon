package fochamon.Types;

import fochamon.Type;

public class Fire extends Type {
	public Fire() {
		super("Fire");
		this
		.addStrength(new Plant())
		.addWeakness(new Water());
	}
}
