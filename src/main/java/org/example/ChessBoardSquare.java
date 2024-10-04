package org.example;

public class ChessBoardSquare {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));

    }

    public static boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        char number = coordinates.charAt(1);
        boolean letterOdd = letter % 2 == 0;
        boolean numberOdd = number % 2 == 0;
        return letterOdd != numberOdd;
    }
}
