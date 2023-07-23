package exception;

import javax.swing.text.TabSet;
import java.util.*;

public class Main01 {
    public int a = 0;

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        int result = 0;

        try {
            result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            throw new RuntimeException();
        } finally {
            System.out.println("This you will see always");
        }

        Object o = new Main01();

        Main01 main01 = new Main01();
        SortedSet<Integer> list = new TreeSet<>();


    }
}
