package streams.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream objOStr = new ObjectOutputStream(new FileOutputStream("serial.txt"))) {
            MyClass object1 = new MyClass("Welcome", -7, 2.7e10);
            System.out.println("Object1 " + object1);
            objOStr.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization");
        }

        try (ObjectInputStream objIStr = new ObjectInputStream(new FileInputStream("serial.txt"))) {
            MyClass object2 = (MyClass) objIStr.readObject();
            System.out.println("Object2 " + object2);
        } catch (ClassNotFoundException e) {
            System.out.println("Exception during deserialization");
        }
    }
}
