package problemSolving;

import java.io.*;
import java.util.*;

public class Vowel {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = findSubstring(s, k);


        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static String findSubstring(String s, int k) {
        String result = "Not found!";
        StringBuilder mapString;
        List<String> firstStringList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        String vowels = "aeiou";
        int resultI = 0;
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            for (int j = 0; j < vowels.length(); j++) {
                char vowelChar = vowels.charAt(j);
                if (String.valueOf(sChar).equals(String.valueOf(vowelChar))) {
                    try {
                        mapString = new StringBuilder(s.substring(i, i + k));
                        firstStringList.add(String.valueOf(mapString));
                    } catch (StringIndexOutOfBoundsException ignored) {

                    }
                }
            }

        }
        if (!firstStringList.isEmpty()) {
            for (int i = 0; i < firstStringList.size(); i++) {
                String stringToChange = firstStringList.get(i);
                String s1 = stringToChange.replaceAll("a", "").replaceAll("e", "")
                        .replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
                secondList.add(firstStringList.get(i).length() - s1.length());
            }
            Integer max = Collections.max(secondList);
            for (int i = 0; i < secondList.size(); i++) {
                if (secondList.get(i) == max) {
                    resultI = i;
                    break;
                }
            }
            result = firstStringList.get(resultI);
        }


        return result;
    }
}
