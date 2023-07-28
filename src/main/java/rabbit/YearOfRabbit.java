package rabbit;

import java.io.*;

public class YearOfRabbit {

    public static int solution(int[] A, int[] B) {
        int result = 0;
        boolean isPossible = false;
        int counter = 0;
        int shifting = A.length;

        while (shifting > 0) {
            for (int i = 0; i < A.length; i++) {
                if ((A[i] == B[i])) {
                    break;
                } else {
                    counter++;
                }
            }
            if (counter == A.length) {
                isPossible = true;
                break;
            } else {
                result++;
            }
            counter = 0;
            shifting--;
            int last = B[B.length - 1];
            for (int i = B.length - 1; i > 0; i--) {
                B[i] = B[i - 1];
                if (i == 1) {
                    B[0] = last;
                }
            }
        }
        if (isPossible) {
            return result;
        } else return -1;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringA = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] stringB = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int[] A = new int[stringA.length];
        int[] B = new int[stringB.length];

        for (int i = 0; i < stringA.length; i++) {
            A[i] = Integer.parseInt(stringA[i]);
            B[i] = Integer.parseInt(stringB[i]);
        }

        int result = solution(A, B);
        System.out.println(result);

        bufferedReader.close();
    }
}
