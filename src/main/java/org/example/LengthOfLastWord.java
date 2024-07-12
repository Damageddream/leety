package org.example;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(test1) == 5);
        System.out.println(lengthOfLastWord(test2) == 4);
        System.out.println(lengthOfLastWord(test3) == 6);

    }
    public static int lengthOfLastWord(String s) {

        String[] sSplit = s.trim().split(" ");
        return sSplit[sSplit.length-1].length();
    }
}
