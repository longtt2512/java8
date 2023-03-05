package core.immutable;

import java.util.HashMap;

/**
 * @author long.truong@finos.asia
 */
public final class TestImmutableClass {

    private final int id;
    private final HashMap<String,String> mapData;

    public TestImmutableClass(int id, HashMap<String, String> mapDataInput) {
        this.id = id;
        // Do deep copy
        this.mapData = new HashMap<>();
        mapDataInput.forEach(mapData::put);
    }
}
