package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class ValidParenthases {
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "{[]}";
        String test5 = "[";
        String test6 = "]";
        String test7 = "(){}}{";
        System.out.println(isValid(test1) == true);
        System.out.println(isValid(test2) == true);
        System.out.println(isValid(test3) == false);
        System.out.println(isValid(test4) == true);
        System.out.println(isValid(test5) == false);
        System.out.println(isValid(test6) == false);
        System.out.println(isValid(test7) == false);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> openParent = List.of('(', '[', '{');
        for (char c : s.toCharArray()) {
            if(openParent.contains(c)){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                Character poped = stack.pop();
                if(!((c == ')' && poped == '(') || (c == ']' && poped == '[') || (c == '}' && poped == '{'))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
//        for (int i = 0; i < s.length(); i++) {
//            if (i < s.length() - 1) {
//                if (s.charAt(i) == '(') {
//                    if (s.charAt(i + 1) == ')') {
//                        i += 1;
//                        continue;
//                    }
//                    return false;
//                }
//                if ((int) s.charAt(i) == (int) s.charAt(i + 1) - 2) {
//                    i += 1;
//                    continue;
//                }
//                return false;
//            }
//        }
//        return true;