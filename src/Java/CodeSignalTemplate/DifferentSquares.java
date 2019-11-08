package CodeSignalTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DifferentSquares {
    public static void main(String[] args) {
        int[][] input =
                {{2, 5, 3, 4, 3, 1, 3, 2},
                        {4, 5, 4, 1, 2, 4, 1, 3},
                        {1, 1, 2, 1, 4, 1, 1, 5},
                        {1, 3, 4, 2, 3, 4, 2, 4},
                        {1, 5, 5, 2, 1, 3, 1, 1},
                        {1, 2, 3, 3, 5, 1, 2, 4},
                        {3, 1, 4, 4, 4, 1, 5, 5},
                        {5, 1, 3, 3, 1, 5, 3, 5},
                        {5, 4, 4, 3, 5, 4, 4, 4}};
        System.out.println(differentSquares(input));
    }

    static int differentSquares(int[][] matrix) {
        int output;
        boolean flag;
        int duplicateMatrices = 0;
        List<int[][]> listOf2by2Matrices;
        List<int[][]> notUniqueMatrices = new LinkedList<>();

        listOf2by2Matrices = getListOfAll2by2Matrices(matrix);

        for (int i = 0; i < listOf2by2Matrices.size(); i++) {
            flag = isUniqueMatrix(listOf2by2Matrices.get(i), notUniqueMatrices);

            for (int j = 0; j < listOf2by2Matrices.size(); j++) {
                if (i != j && flag) {
                    if (areEqual(listOf2by2Matrices.get(i), listOf2by2Matrices.get(j))) {
                        notUniqueMatrices.add(listOf2by2Matrices.get(i));
                    }
                }
            }
            if (!flag) {
                duplicateMatrices++;
            }
        }
        output = listOf2by2Matrices.size() - duplicateMatrices;
        return output == 0 && listOf2by2Matrices.size() > 0 ? 1 : output;
    }

    private static List<int[][]> getListOfAll2by2Matrices(int[][] matrix) {
        List<int[][]> outputList = new ArrayList<>();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                outputList.add(new int[][]{{matrix[i][j], matrix[i][j + 1]}, {matrix[i + 1][j], matrix[i + 1][j + 1]}});
            }
        }
        return outputList;
    }

    private static boolean isUniqueMatrix(int[][] matrix, List<int[][]> notUniqueMatrices) {
        for (int[][] notUniqueMatrix : notUniqueMatrices) {
            if (areEqual(matrix, notUniqueMatrix)) {
                return false;

            }
        }
        return true;
    }

    static boolean areEqual(final int[][] matrix1, final int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            if (!Arrays.equals(matrix1[i], matrix2[i])) {
                return false;
            }
        }
        return true;
    }
}
