package lambda;

public interface GenericInterface<T> {

    T someFunc(T t);

    default void printSome(int a) {
        System.out.println("You give me " + a);
    }

    static int printSum(int a, int b) {
        return a + b;
    }
}
