package tomat.dev.xin4j.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HttpUtils {
    public static String getJson(String urlString, Map<String, String> headers) {
        try {
            // Open url connection with GET request.
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            for (Map.Entry<String, String> header : headers.entrySet()) {
                conn.setRequestProperty(header.getKey(), header.getValue());
            }

            conn.connect();

            // Grab the response code and check if it was successful.
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Error connecting to " + urlString + ". Response code: " + responseCode);
                return "";
            } else {
                StringBuilder inline = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                // Write all the JSON data into a string using a scanner.
                while (scanner.hasNext()) {
                    inline.append(scanner.nextLine());
                }

                // Close the scanner and return the JSON string.
                scanner.close();
                return inline.toString();
            }

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getJson(String urlString) {
        return getJson(urlString, new HashMap<>());
    }
}
