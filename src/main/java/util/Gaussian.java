package util;

import java.util.Random;

public class Gaussian {


    public static void main(String[] args) {

        Random random = new Random();
        double value, sum = 0;
        int[] bell = new int[10];

        for (int i = 0; i < 100; i++) {
            value = random.nextGaussian();
            sum += value;
            double t = -2;
            for (int j = 0; j < 10; j++, t += 0.5)
                if (value < t) {
                    bell[j]++;
                    break;
                }
        }
        System.out.println("Arithmetical average is " + sum / 100);
//            display Gaussian (90 degrees turned)
        for (int i = 0; i < 10; i++) {
            for (int j = bell[i]; j > 0; j--)
                System.out.print("*");
        System.out.println();
        }
    }
}
