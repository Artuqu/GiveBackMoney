package problemSolving;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class AnagramDictionary {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> query = IntStream.range(0, queryCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> result = stringAnagram(dictionary, query);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        int result = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < query.size(); i++) {
            char[] firstString = query.get(i).toCharArray();
            Arrays.sort(firstString);
            for (int j = 0; j < dictionary.size(); j++) {
                char[] secondString = dictionary.get(j).toCharArray();
                Arrays.sort(secondString);
                if (Arrays.equals(firstString, secondString)) {
                    result++;
                }
            }
            resultList.add(result);
            result = 0;

        }
        return resultList;

    }
}
