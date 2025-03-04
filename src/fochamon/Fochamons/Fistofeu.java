package fochamon.Fochamons;

import fochamon.Fochamon;
import fochamon.Types.Fire;

public class Fistofeu extends Fochamon {
	public Fistofeu() {
		super("Fistofeu", 34, 12, 14, 6, 8, 74);
		this.addType(new Fire());
	}
}
