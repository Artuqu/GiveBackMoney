package dynamicPrograming;

public class Memoized {

    static int[] cache = new int[1];

    public static int memoizedAddTo80(int n) {
        if (cache[0] == n + 80) {
            return cache[0];
        } else {
            System.out.println("long time");
            cache[0] = n + 80;
        }
        return cache[0];
    }

    public static void main(String[] args) {

        System.out.println(memoizedAddTo80(3));
        System.out.println(memoizedAddTo80(4));
        System.out.println(memoizedAddTo80(4));
    }
}
