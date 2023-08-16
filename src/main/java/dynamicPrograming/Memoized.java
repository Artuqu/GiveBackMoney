package dynamicPrograming;

import java.util.HashMap;

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


    public int addTo80(int n) {
        System.out.println("long time");
        return n + 80;
    }


    HashMap<Integer, Integer> hashCache = new HashMap<>();

    public int memoizeAddTo80(int n) {
        // once cached it won't have to add every time the function is called.
        if (!hashCache.containsKey(n)) {
            System.out.println("long time");
            hashCache.put(n, n + 80);
        }
        return hashCache.get(n);
    }


    public static void main(String[] args) {

        System.out.println(memoizedAddTo80(3));
        System.out.println(memoizedAddTo80(4));
        System.out.println(memoizedAddTo80(4));


        Memoized memo = new Memoized();
        System.out.println("addTo80: " + memo.addTo80(5));
        System.out.println("addTo80: " + memo.addTo80(5));

        System.out.println("memoizeAddTo80: " + memo.memoizeAddTo80(5));
        System.out.println("memoizeAddTo80: " + memo.memoizeAddTo80(5));
        System.out.println("memoizeAddTo80: " + memo.memoizeAddTo80(5));

    }
}
