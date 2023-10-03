package collections.map;

import java.io.*;
import java.util.Properties;

public class PhoneBook {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name, phoneNumber;
        boolean changed = false;
        FileInputStream fileInputStream = null;

        File book = new File("phonebook.dat");
        if (book.exists()) {
            fileInputStream = new FileInputStream("phonebook.dat");
        } else {
            book.createNewFile();
        }

        if (fileInputStream != null) {
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Error by loading the file");
            }
        }

        do {
            System.out.print("Type new name and last name (Type 'end' for quit): ");
            name = reader.readLine();
            if (name.equalsIgnoreCase("end")) continue;
            System.out.print("Type the phone number: ");
            phoneNumber = reader.readLine();

            properties.put(name, phoneNumber);
            changed = true;
        } while (!name.equalsIgnoreCase("end"));


        if (changed) {
            FileOutputStream fileOutputStream = new FileOutputStream("phonebook.dat");
            properties.store(fileOutputStream, "PhoneBook");
            fileOutputStream.close();
        }

        do {
            System.out.print("Type name and last name for search (Type end for quit): ");
            name = reader.readLine();
            if (name.equalsIgnoreCase("end")) continue;
            phoneNumber = properties.getProperty(name);
            System.out.println(phoneNumber);
        } while (!name.equalsIgnoreCase("end"));
        reader.close();
    }
}
