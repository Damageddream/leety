package org.example;

public class FirstOccurence {
    public static void main(String[] args) {
        int firstTest = strStr("sadbutsad", "sad");
        int secondTest = strStr("leetcode", "leeto");
        System.out.println(firstTest == 0);
        System.out.println(secondTest == -1);

    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
