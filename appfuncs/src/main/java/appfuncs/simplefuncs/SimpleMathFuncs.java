package appfuncs.simplefuncs;

public class SimpleMathFuncs {

    //    is a factor of b
    public static boolean isFactor(int a, int b) {
        if (b % a == 0) return true;
        return false;
    }

    //    return smallest common factor grater than zero
    public static int lcf(int a, int b) {
        Result result = getResult(a, b);

        for (int i = 2; i <= result.min() / 2; i++) {
            if (isFactor(i, result.a()) && isFactor(i, result.b()))
                return i;
        }
        return 1;
    }

    private static Result getResult(int a, int b) {
        //        only positive integers
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);
        Result result = new Result(a, b, min);
        return result;
    }

    private record Result(int a, int b, int min) {
    }

    //    return the greatest common factor grater than zero
    public static int gcf(int a, int b) {
        Result result = getResult(a, b);

        for (int i = result.min / 2; i >= 2; i--) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }

}
