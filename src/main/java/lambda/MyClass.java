package lambda;

import java.lang.module.ModuleFinder;

public class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public MyClass() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

}
