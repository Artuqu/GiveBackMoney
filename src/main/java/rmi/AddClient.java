package rmi;

import java.rmi.Naming;

public class AddClient {
    public static void main(String[] args) {
        try {
            String serverUrl = "rmi://" + args[0] + "/AddServer";
            AddServerInt addServerInt = (AddServerInt) Naming.lookup(serverUrl);
            System.out.println("First number: " + args[1]);
            double d1 = Double.parseDouble(args[1]);
            System.out.println("Second number: " + args[2]);
            double d2 = Double.parseDouble(args[2]);
            System.out.println("Sum: " + addServerInt.add(d1, d2));
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
