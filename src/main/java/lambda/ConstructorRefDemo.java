package lambda;

public class ConstructorRefDemo {

    public static void main(String[] args) {

        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("Saved value is " + mc.getValue());
    }
}