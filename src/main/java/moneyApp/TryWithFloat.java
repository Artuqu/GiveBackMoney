package moneyApp;

public class TryWithFloat {


    private final static int[] moneyQuantity = {1, 3, 5, 10, 20, 200, 100, 100, 10000};
    private final static float[] coin = {5, 2, 1, 0.5F, 0.2F, 0.1F, 0.05F, 0.02F, 0.01F};

    public static float restSolution(float rest) {
        float result = 0.0F;
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
                    rest = (float) (Math.round(rest * 100.0) / 100.0);
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
        restSolution(1.30F);
        restSolution(11.70F);
        restSolution(6.70F);
        restSolution(4.3F);
        restSolution(153);
    }


}
