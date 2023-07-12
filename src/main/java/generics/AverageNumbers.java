package generics;

public class AverageNumbers<T extends Number> {

    T[] numbers;

    AverageNumbers(T[] o) {
        numbers = o;
    }

    void getType() {
        System.out.println("Type of value is: " + numbers.getClass().getName());
    }

    double getAverage() {
        double average = 0.0;
        for (T number : numbers) {
            average += number.doubleValue();
        }
        return average / numbers.length;
    }

}
