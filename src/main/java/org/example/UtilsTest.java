package org.example;

public class UtilsTest {

    public static void main(String[] args) {
        String someStringValue = "hello_world_example";
        String formattedString = convertToCamelCase(someStringValue);
        System.out.println(formattedString); // Output: helloWorldExample
    }

    public static String convertToCamelCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        input = input.toLowerCase();

        // Split by underscore '_'
        String[] words = input.split("_");

        // Capitalize each word except the first one
        StringBuilder result = new StringBuilder(words[0]); // Keep the first word as is (lowercase)

        for (int i = 1; i < words.length; i++) {
            result.append(capitalizeFirstLetter(words[i]));
        }

        return result.toString();
    }

    private static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
