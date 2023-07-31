package collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, Double> treeMap = new TreeMap<>(Comparator.comparing(String::length));
        Comparator<Map<String, Double>> comparator = new Comparator<Map<String, Double>>() {
            @Override
            public int compare(Map<String, Double> o1, Map<String, Double> o2) {
                return 0;
            }
        };
        System.out.println(comparator.reversed());
        System.out.println();

        treeMap.put("Wallace D. Wattles", 8526.94);
        treeMap.put("Ralph Waldo Emerson", 9502.06);
        treeMap.put("John Smith", 3566.44);
        treeMap.put("Edgar Alan Poe", 5699.02);


        for (Map.Entry<String, Double> map : treeMap.entrySet()) {
            System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue());
        }
    }
}
