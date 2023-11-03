package streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        String source = "It's time for every good citizen realize that their country need them to serve";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        String txt1 = "/home/artur/Dokumenty/GitHub/RestMoney/src/main/java/streams/file1.txt";
        String txt2 = "/home/artur/Dokumenty/GitHub/RestMoney/src/main/java/streams/file2.txt";
        String txt3 = "/home/artur/Dokumenty/GitHub/RestMoney/src/main/java/streams/file3.txt";
        try (FileWriter f0 = new FileWriter(txt1); FileWriter f1 = new FileWriter(txt2); FileWriter f2 = new FileWriter(txt3)) {
            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }
            f1.write(buffer);

            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
