package org.example;

public class RookAttack {
    public static void main(String[] args) {
        char[][] test = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(numRookCaptures(test));

    }

    public static int numRookCaptures(char[][] board) {
        int[] rookPos = new int[2];
        int possibleCap = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    rookPos[0] = i;
                    rookPos[1] = j;
                    break;
                }
            }
        }
        char left = '.';
        if (rookPos[1] > 0) {
            for (int rookPo = 0; rookPo < rookPos[1] ; rookPo++) {
                if (board[rookPos[0]][rookPo] != '.') {
                    left = board[rookPos[0]][rookPo];
                }
            }
            if (left == 'p') {
                possibleCap++;
            }
        }
        char right = '.';
        if (rookPos[1] < 8) {
            for (int i = 7; i > rookPos[1]; i--) {
                if (board[rookPos[0]][i] != '.') {
                    right = board[rookPos[0]][i];
                }
            }
            if (right == 'p') {
                possibleCap++;
            }
        }
        char top = '.';
        if (rookPos[0] > 0) {
            for (int rookPo = 0; rookPo < rookPos[0] ; rookPo++) {
                if (board[rookPo][rookPos[1]] != '.') {
                    top = board[rookPo][rookPos[1]];
                }
            }
            if (top == 'p') {
                possibleCap++;
            }
        }

        char down = '.';
        if (rookPos[0] < 8) {
            for (int i = 7; i > rookPos[0]; i--) {
                if (board[i][rookPos[1]] != '.') {
                    down = board[i][rookPos[1]];
                }
            }
            if (down == 'p') {
                possibleCap++;
            }
        }
        return possibleCap;
    }
}
