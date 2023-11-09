package net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpUrlDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL ("http://www.google.com");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        System.out.println("Request method: " + conn.getRequestMethod());
        System.out.println("Response code: " + conn.getResponseCode());
        System.out.println("Response message: " + conn.getResponseMessage());

        Map<String, List<String>> map = conn.getHeaderFields();
        Set<String> mapKeys = map.keySet();

        for (String s: mapKeys){
            System.out.println("Key: " + map + ", Value: " + map.get(s));
        }
    }
}
