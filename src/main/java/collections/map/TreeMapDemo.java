package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, Double> treeMap = new TreeMap<>();

        treeMap.put("Wallace D. Wattles", 8526.94);
        treeMap.put("Ralph Waldo Emerson", 9502.06);
        treeMap.put("John Smith", 3566.44);
        treeMap.put("Edgar Alan Poe", 5699.02);


        for (Map.Entry<String, Double> map : treeMap.entrySet()) {
            System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue());
        }
    }
}
