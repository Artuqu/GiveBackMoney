package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ReturnStringOrInt {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<String> stringList = Arrays.stream(bufferedReader.readLine().split(" "))
                .toList();
        System.out.println(printResult(stringList));


    }

    private static String printResult(List<String> strings) {
        String result = "";
        int counting = 0;
        try {
            for (int i = 0; i < strings.size(); i++) {
                counting += Integer.parseInt(strings.get(i));
            }
            result = String.valueOf(counting);
            return result;
        } catch (NumberFormatException e) {
        }


        for (String i : strings
        ) {
            result += i;

        }
        return result;
    }
}