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

        Stream<Integer> myStream = list.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        minVal.ifPresent(i -> System.out.println("Min value: " + i));

        myStream = list.stream();

        Optional<Integer> maxValue = myStream.max(Integer::compare);
        maxValue.ifPresent(i -> System.out.println("Max value: " + i));

        Stream<Integer> sorted = list.stream().sorted();
        System.out.print("Sorted myStream: ");
//        sorted.forEach(n -> System.out.print(n + " "));
        sorted.forEach(list2::add);
        System.out.print(list2);

        Stream<Integer> oddValues = list.stream().filter(n -> n % 2 == 1);
        System.out.print("\nOdd values: ");
        oddValues.forEach(n -> System.out.print(n + " "));

        oddValues = list.stream().filter(n -> n % 2 == 1).filter(n -> n > 5);
        System.out.print("\nOdd values higher than five: ");
        oddValues.forEach(n -> System.out.print(n + " "));

        myStream = list.stream();
        Integer reduceResult = myStream.reduce(1, (a, b) -> {
            if (b % 2 == 0) return a * b;
            else return a;
        });
        System.out.println();
        System.out.println("Sum of even values: " + reduceResult);

        double parallel = list.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
        System.out.println("Result of square: " + parallel);

//        map version
        Stream<Double> root = list.stream().map(Math::sqrt);
        double sqrtRoot = root.reduce(1.0, (a, b) -> a * b);
        System.out.println("Sequence with map version: " + sqrtRoot);
    }
}
