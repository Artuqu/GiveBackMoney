package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<Integer, Integer> integerMap = new TreeMap<>();
        integerMap.put(4, 304);
        integerMap.put(2, 809);
        integerMap.put(1, 34);
        integerMap.put(3, 556);


        for (Map.Entry<Integer, Integer> map : integerMap.entrySet()) {
            System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue());
        }
    }
}
