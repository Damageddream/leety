package org.example;

public class Robot {
    public static void main(String[] args) {
        judgeCircle("a");
    }

    public static boolean judgeCircle(String moves) {
        int[] start = new int[2];
        start[0] = 0;
        start[1] = 0;
        for (int i = 0; i < moves.length(); i++) {
            char letter = moves.charAt(i);
            if (letter == 'U') {
                start[0] += 1;
            } else if (letter == 'D') {
                start[0] -= 1;
            } else if (letter == 'L') {
                start[1] += 1;
            } else if (letter == 'R') {
                start[1] -= 1;

            }
        }
        if (start[0] == 0 && start[1] == 0) {
            return true;
        }
        return false;
    }
}
