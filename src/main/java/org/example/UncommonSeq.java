package org.example;

public class UncommonSeq {
    public static void main(String[] args) {
        String testSa = "aefawfawfawfaw";
        String testSb = "aefawfeawfwafwaef";
        String test2Sa = "aaa";
        String test2Sb = "bbb";
        String test3Sa = "aaa";
        String test3Sb = "aaa";
        System.out.println(findLUSlength(testSa, testSb));
//        System.out.println(findLUSlength(test2Sa, test2Sb));
//        System.out.println(findLUSlength(test3Sa, test3Sb));

    }
    public static int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
