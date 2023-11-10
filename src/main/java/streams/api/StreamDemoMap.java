package streams.api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemoMap {


    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("John", "555-5555", "john89@gmail.com"));
        list.add(new NamePhoneEmail("Chris", "555-4444", "chris55@gmail.com"));
        list.add(new NamePhoneEmail("Marie", "555-3333", "marieAn@gmail.com"));
        System.out.println("Beginning content of list: ");
        list.forEach(a -> System.out.println(a.name + " " + a.phone + " " + a.email));

        Stream<NamePhone> namePhone = list.stream().map(a -> new NamePhone(a.name, a.phone));

        System.out.println("List of names and phones in new stream: ");
        namePhone.forEach(a -> System.out.println(a.name + " " + a.phone));

    }
}

class NamePhoneEmail {
    String name;
    String phone;
    String email;

    public NamePhoneEmail(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}