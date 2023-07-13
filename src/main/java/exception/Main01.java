package exception;

public class Main01 {


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

    }
}
