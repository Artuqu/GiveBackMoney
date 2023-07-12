package generics;

public class GenDemo {

    public static void main(String[] args) {
        Gen<Integer> integerGen = new Gen<>(88);
        integerGen.showType();

        int v = integerGen.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        Gen<String> stringGen = new Gen<>("This is the basic String");
        stringGen.showType();

        String str = stringGen.getOb();
        System.out.println("Value: " + str);

    }
}
