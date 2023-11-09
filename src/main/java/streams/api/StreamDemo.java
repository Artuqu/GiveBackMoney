package streams.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Integer[] toAdd = {7, 18, 10, 24, 17, 5};

        ArrayList<Integer> list = new ArrayList<>(List.of(toAdd));
        ArrayList<Integer> list2 = new ArrayList<>(toAdd.length);

        System.out.println("Beginning list: " + list);

        Stream<Integer> stream = list.stream();

        Optional<Integer> minVal = stream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("Min value: " + integer));

        stream = list.stream();

        Optional<Integer> maxValue = stream.max(Integer::compare);
        maxValue.ifPresent(i -> System.out.println("Max value: " + i));

        Stream<Integer> sorted = list.stream().sorted();
        System.out.print("Sorted stream: ");
//        sorted.forEach(n -> System.out.print(n + " "));
        sorted.forEach(list2::add);
        System.out.print(list2);

        Stream<Integer> oddValues = list.stream().filter(n -> n % 2 == 1);
        System.out.print("\nOdd values: ");
        oddValues.forEach(n -> System.out.print(n + " "));

        oddValues = list.stream().filter(n -> n % 2 == 1).filter(n -> n > 5);
        System.out.print("\nOdd values higher than five: ");
        oddValues.forEach(n -> System.out.print(n + " "));
    }
}
