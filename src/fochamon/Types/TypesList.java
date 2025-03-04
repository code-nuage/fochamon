package fochamon.Types;

import java.util.HashMap;
import java.util.Map;

import fochamon.Type;

public class TypesList {
    public static final Map<String, Type> types = new HashMap<>();
    
    static {
        types.put("FIRE", new Fire());
        types.put("WATER", new Water());
        types.put("PLANT", new Plant());
    }
}
