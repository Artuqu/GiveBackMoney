package lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 123.0;
        System.out.println(myNumber.getValue());
        myNumber = () -> 145.55;
        System.out.println(myNumber.getValue());

    }
}
