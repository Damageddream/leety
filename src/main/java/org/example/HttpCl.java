package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpCl {
    public static void main(String[] args) {
        String apiUrl = "https://api.github.com/repos/torvalds/linux"; // Example API

        // Call the method
        String response = sendHttpRequest(apiUrl);
        System.out.println("API Response: " + response);
    }

    public static String sendHttpRequest(String url) {
        try {
            // Create an HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Build the HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url)) // API URL
                    .header("Accept", "application/json") // Set header
                    .GET() // Use GET method
                    .build();

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Return the response body
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred: " + e.getMessage();
        }
    }
}
