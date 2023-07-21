package collections;

import java.io.*;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedSetDemo {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Results"));

        SortedSet<Integer> integerSortedSet = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ConcurrentSkipListSet::new));
        writer.write(integerSortedSet.toString());


        reader.close();
        writer.close();
    }
}
