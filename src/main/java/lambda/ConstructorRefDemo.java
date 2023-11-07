package lambda;

public class ConstructorRefDemo implements GenericInterface {

    public static void main(String[] args) {
        ConstructorRefDemo constructorRefDemo = new ConstructorRefDemo();
        constructorRefDemo.printSome(2);
        constructorRefDemo.someFunc("aa");
        GenericInterface.printSum(2, 2);
        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);
        MyClass func = myClassCons.func(200);

        System.out.println("Saved value is " + mc.getValue() + " "
//                + func.getValue()
                );
    }

    @Override
    public Object someFunc(Object o) {
        return o;
    }

}
