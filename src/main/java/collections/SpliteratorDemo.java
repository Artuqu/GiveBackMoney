package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

    public static void main(String[] args) {
        List<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);


        System.out.println("Contain of vals:");
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance(System.out::println)) ;
        System.out.println();


        spliterator = vals.spliterator();
        List<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance(n -> {
            sqrs.add(Math.sqrt(n));
        }));

        System.out.println("Contain of sqrs:");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining(System.out::println);

    }
}
