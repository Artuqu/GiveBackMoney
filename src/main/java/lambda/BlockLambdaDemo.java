package lambda;

public class BlockLambdaDemo {

    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda after reverse is: " + reverse.func("Lambda"));
        System.out.println("Expression after reverse is: " + reverse.func("Expression"));


    }
}
