package hash.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {
    public static List simpleLeftJoin(HashMap left, HashMap right) {
        List<String[]> output = new ArrayList<>();
        Collection keys = left.keySet();
        for (Object key : keys) {
            String[] row = new String[3];
            row[0] = key.toString();
            row[1] = left.get(key).toString();
            row[2] = right.containsKey(key) ?
                    right.get(key).toString() :
                    null;
            output.add(row);
        }
        return output;
    }
}
