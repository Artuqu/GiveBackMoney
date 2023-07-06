package moneyApp;

public class GiveMeRest {


    private final static int[] moneyQuantity = {1, 3, 5, 10, 20, 200, 100, 100, 10000};
    private final static double[] coin = {5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

    public static double restSolution(double rest) {
        double result = 0.0;
        double quantity = 0;

        System.out.println("For rest " + rest);
        for (int i = 0; i < moneyQuantity.length; i++) {
            quantity += moneyQuantity[i] * coin[i];
        }
        if (quantity > rest) {
            for (int i = 0; i < moneyQuantity.length; i++) {
                while (moneyQuantity[i] > 0 && coin[i] <= rest) {
                    rest -= coin[i];
                    System.out.println("Coin " + coin[i]);
                    moneyQuantity[i]--;
                    rest = Math.round(rest * 100.0) / 100.0;
                }
            }
        } else {
            System.out.println("Bank is Empty!");
            throw new RuntimeException();
        }
        System.out.println();

        return result;
    }


    public static void main(String[] args) {
        restSolution(1.30);
        restSolution(11.70);
        restSolution(6.70);
        restSolution(4.3);
        restSolution(153);
    }

}
