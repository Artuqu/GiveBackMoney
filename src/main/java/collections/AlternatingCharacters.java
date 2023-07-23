package collections;

import java.io.*;
import java.util.stream.IntStream;

public class AlternatingCharacters {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Results"));

        int q = Integer.parseInt(reader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = reader.readLine();

                int result = alternatingCharacters(s);

                writer.write(String.valueOf(result));
                writer.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        reader.close();
        writer.close();
    }

    private static int alternatingCharacters(String s) {
        int result = 0;
        String firstChar = String.valueOf(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(firstChar)) {
                String.valueOf(s.charAt(i)).replace(String.valueOf(s.charAt(i)), "");
                result++;
            }
            firstChar=String.valueOf(s.charAt(i));

        }
        return result;
    }
}
