package generics;

public class AverageDemo {


    public static void main(String[] args) {

        Integer[] num = {1, 5, 6, 9, 0};
        AverageNumbers<Integer> intNumbers = new AverageNumbers<>(num);
        double v = intNumbers.getAverage();
        intNumbers.getType();
        System.out.println("Average value for v is " + v);
        System.out.println();

        Double[] doubleNum = {2.2, 4.7, 2.9, 8.67};
        AverageNumbers<Double> doubleAverageNumbers = new AverageNumbers<>(doubleNum);
        double d = doubleAverageNumbers.getAverage();
        doubleAverageNumbers.getType();
        System.out.println("Average value for d is " + d);

        System.out.println();
        System.out.println(intNumbers.compareAverage(doubleAverageNumbers));

    }
}
