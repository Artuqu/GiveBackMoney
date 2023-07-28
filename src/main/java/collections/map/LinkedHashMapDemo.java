package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();

        lhm.put("John Smith", 3566.44);
        lhm.put("Ralph Waldo Emerson", 9502.06);
        lhm.put("Edgar Alan Poe", 5699.02);
        lhm.put("Wallace D. Wattles", 8526.94);

        for (Map.Entry<String, Double> entry : lhm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
