package fochamon.Fochamons;

import java.util.HashMap;
import java.util.Map;

import fochamon.Fochamon;

public class FochamonsList {
    public static final Map<String, Fochamon> types = new HashMap<>();
    
    static {
        types.put("PELIKLUKLUXKLAN", new Peliklukluxklan());
        types.put("FISTOFEU", new Fistofeu());
    }
}
