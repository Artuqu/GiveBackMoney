package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpr {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher("test 1 2 3 4 test");

        while (matcher.find()) {
            System.out.println("The word was found by index: " + matcher.start() + ", and ends with index: " + (matcher.end() - 1));
        }
    }
}
