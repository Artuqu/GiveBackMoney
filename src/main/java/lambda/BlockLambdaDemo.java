package lambda;

public class BlockLambdaDemo {


    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            return getStringStatic(str);
        };
        System.out.println("Lambda after reverse is: " + reverse.func("Lambda"));
        System.out.println("Expression after reverse is: " + reverse.func("Expression"));


        GenericInterface<String> reverse2 = (s -> {
            return getStringStatic(s);
        });
        System.out.println("Lambda after reverse is: " + reverse2.someFunc("Lambda"));


    }

    public String getString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String getStringStatic(String str){
        BlockLambdaDemo blockLambdaDemo = new BlockLambdaDemo();
        return blockLambdaDemo.getString(str);
    }

}
