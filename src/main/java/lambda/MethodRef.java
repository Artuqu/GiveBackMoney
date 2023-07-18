package lambda;

public class MethodRef {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda's expressions make Java better";
        String outStr;

//        reference from static method
        outStr = stringOp(BlockLambdaDemo::getStringStatic, inStr);
        System.out.println(outStr);
//        instance method from new object
        BlockLambdaDemo strOps = new BlockLambdaDemo();

        outStr = stringOp(strOps::getString, inStr);
        System.out.println(outStr);
    }


}
