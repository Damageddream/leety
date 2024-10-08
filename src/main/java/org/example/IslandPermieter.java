package org.example;

public class IslandPermieter {
    public static void main(String[] args) {
        int[][] test = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter(test));
        int[][] test2 = {{1}};
        System.out.println(islandPerimeter(test2));

    }

    public static int islandPerimeter(int[][] grid) {
        int permieter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0) {
                        permieter += 1;
                    }
                    if (i == grid.length - 1) {
                        permieter += 1;
                    }
                    if (j == 0) {
                        permieter += 1;
                    }
                    if( j == grid[i].length - 1){
                        permieter += 1;
                    }
                    if (j > 0 && grid[i][j - 1] == 0) {
                        permieter += 1;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 0) {
                        permieter += 1;
                    }
                    if (i > 0 && grid[i - 1][j] == 0) {
                        permieter += 1;
                    }
                    if (i < grid.length - 1 && grid[i + 1][j] == 0) {
                        permieter += 1;
                    }

                }
            }
        }
        return permieter;
    }
}
