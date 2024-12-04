package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "sa";
        String password = "sa1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
