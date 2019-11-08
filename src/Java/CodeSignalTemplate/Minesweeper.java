package CodeSignalTemplate;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Minesweeper {
    public static void main(String[] args) {
//        boolean[][] a = {
//                {true, false, false},
//                {false, true, false},
//                {false, false, false}};
//        boolean[][] a = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true}};
//        boolean[][] a = {{true,false,false,true},
//                {false,false,true,false},
//                {true,true,false,true}};
        boolean[][] a = {
                {true,false,false,true},
                {false,false,true,false},
                {true,true,false,true}};
        Arrays.stream(minesweeper(a)).forEach(row -> {
            System.out.print("[");
            Arrays.stream(row).forEach(element -> System.out.print(" " + element + " "));
            System.out.println("]");
        });
    }

    static int[][] minesweeper(boolean[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    checkAroundForBombs(matrix, temp, i, j);
                    if(matrix[i][j]){
                        temp[i][j]-=1;
                    }
            }
        }
        return temp;
    }

    private static void checkAroundForBombs(boolean[][] matrix, int[][] temp, int i, int j) {
        for (int k = i - 1; k <= i + 1; k++) {
            for (int m = j - 1; m <= j + 1; m++) {
                try {
                    if (matrix[k][m]) {
                        temp[i][j]++;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }
        }
    }
}

