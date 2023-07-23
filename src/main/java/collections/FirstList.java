package collections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.LinkedTransferQueue;

public class FirstList<E> {


    public static void main(String[] args) {
        Integer listInt[] = {1, 2, 5, 6, 7, 3, 4};
        Set list1 = new HashSet<>(List.of(listInt));
        HashSet<Integer> hashSet = new HashSet<>(list1);
        List<Integer> integerList = new ArrayList(List.of(listInt));
        Collections.min(hashSet);
        SortedSet<Integer> sortedSet = new ConcurrentSkipListSet<>(Set.of(listInt));


        Set.of(listInt);


        Collection<Integer> integerCollection = new LinkedTransferQueue<>();
        integerCollection.size();
        integerList.add(0, 1);
//        integerList.add(1,"String");
        Object o = integerList.get(0);
        Integer s = integerList.get(0);

        ListIterator<Integer> iterator = integerList.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next() == 1) {
                iterator.remove();
            }
            System.out.println(iterator.next());

        }

        for (int i : sortedSet
        ) {
            System.out.println("Sorted List " + i);

        }


//        for (Object i : integerList) {
//            System.out.println(i);
//        }
        for (int i : hashSet) {
//            hashSet.remove(1);
            System.out.println(i);

        }
        int a =2;
        int b=4;
        System.out.println(Math.pow(a,b));
        boolean c = (a == b);

    }


}
