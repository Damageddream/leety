package org.example;

import java.util.Stack;

public class OutMostParent {
    public static void main(String[] args) {

    }

    public static String removeOuterParentheses(String s) {
        if(s.isEmpty()){
            return "";
        }

        StringBuilder builder = new StringBuilder();
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(charStack.isEmpty()){
                charStack.push(temp);
            } else {
                char top = charStack.peek();
                
            }
        }
        
        return "";
    }
}
