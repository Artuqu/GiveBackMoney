package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i = 0;
        do {
            System.out.println();
            System.out.println("Write any number except zero, to see it Binary, Hex and Octal representation");
            System.out.println("Write X for exit");
            str = reader.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                if (!str.equalsIgnoreCase("X")) {
                    System.out.println("Wrong format!");
                    System.out.println();
                }
            }
            if (i != 0) {
                System.out.println("Binary representation of " + i + " is " + Integer.toBinaryString(i));
                System.out.println("Hex representation of " + i + " is " + Integer.toHexString(i));
                System.out.println("OctaL representation of " + i + " is " + Integer.toOctalString(i));
            }
        } while (!str.equalsIgnoreCase("X"));
        reader.close();
    }
}
