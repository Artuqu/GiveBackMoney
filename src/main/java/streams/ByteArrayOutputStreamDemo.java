package streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        String s = "This string has to be in the array";
        byte buf[] = s.getBytes();

        try {
            bos.write(buf);
        } catch (IOException e) {
            System.out.println("Error by writing");
            return;
        }

        System.out.println("Buffer from string: ");
        System.out.println(bos);
        System.out.println("Is changed to array: ");
        byte[] b = bos.toByteArray();
        for (byte value : b) System.out.print((char) value);
        System.out.println("\nAnd comes to  constructor of OutputStream()");

        try (FileOutputStream f = new FileOutputStream("test.txt")) {
            bos.writeTo(f);
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
            return;
        }
        System.out.println("Resetting of stream");
        bos.reset();
        for (int i = 0; i < 3; i++)bos.write('X');
        System.out.println(bos);
    }
}
