package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    private static boolean apple;

    public static void main(String[] args) {
        Map<Integer, String> firstMap = new HashMap<>();
        Map<Integer, String> secondtMap = new HashMap<>();
        firstMap.put(1, "Apple");
        firstMap.put(2, "Orange");
        firstMap.put(3, "Pineapple");
        firstMap.put(4, "Grapes");

        System.out.println(firstMap.size());

        if (firstMap.containsKey(2)) {
            firstMap.put(2, "Fresh " + firstMap.get(2));
        }

        if (firstMap.containsValue("Apple")) {
            System.out.println(firstMap.get(2).hashCode());
        }
        System.out.println("First map: " + firstMap);

        secondtMap.put(5, "Melon");

        secondtMap.putAll(firstMap);
        System.out.println("Second map: " + secondtMap);

        for (Map.Entry<Integer, String> entry : firstMap.entrySet()) {
            if (entry.getValue().equals("Apple")) {
                Integer key = entry.getKey();
                System.out.println("Key for Apple is " + key);
            }
        }


    }
}
