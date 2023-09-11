package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class SendUrl {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scanner.next();
        System.out.println("Введите Вашу фамилию:");
        String sirName = scanner.next();

        String urlPattern = "http://localhost:8081/tomcatapp/servlet_param?firstName=" + name + "&lastName=" + sirName;

        StringBuffer response = new StringBuffer();
        try {
            URL url = new URL(urlPattern);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            response.append("Response Code : " + responseCode + "\n");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
