package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import userfuncs.binaryfuncs.*;

import java.util.ServiceLoader;

public class MyModAppDemo {

    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10)) System.out.println("Digit 2 is factor of 10");
        System.out.println("The smallest common factor of digits 35 and 105 is " + SimpleMathFuncs.lcf(35, 105) + ".");
        System.out.println("The greatest common factor of digits 35 and 105 is " + SimpleMathFuncs.gcf(35, 105) + ".");

        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

        BinaryFunc binOp = null;

        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absPlus")) {
                binOp = bfp.get();
                break;
            }
        }
        if (binOp != null) System.out.println("Result of function absPlus: " + binOp.func(12, -4) + ".");
        else System.out.println("Can't find function absPlus.");

        binOp = null;

        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absMinus")) {
                binOp = bfp.get();
                break;
            }
        }
        if (binOp != null) System.out.println("Result of function absMinus: " + binOp.func(12, -4) + ".");
        else System.out.println("Can't find function absMinus.");

    }
}
