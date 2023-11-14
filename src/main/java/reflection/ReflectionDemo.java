package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {

    public static void main(String[] args) {
        try {
            A a = new A();
            Class<?> c = a.getClass();
            System.out.println("Public methods in class A: ");
            Method[] methods = c.getMethods();//with inheritance
            Method[] methods1 = c.getDeclaredMethods();//without inheritance

            for (int i = 0; i < methods1.length; i++) {
                int modifier = methods1[i].getModifiers();
                if (Modifier.isPublic(modifier)) {
                    System.out.println(methods1[i].getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
