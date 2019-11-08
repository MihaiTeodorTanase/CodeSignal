package CodeSignalTemplate;

import java.util.Arrays;

public class BoxBlur {
    public static void main(String[] args) {
        int[][] a = {
                {36, 0, 18, 9},
                {27, 54, 9, 0},
                {81, 63, 72, 45}
        };
//        int[][] a = {
//                {1, 1, 1},
//                {1, 7, 1},
//                {1, 1, 1}
//        };
        Arrays.stream(boxBlur(a)).forEach(row -> {
            System.out.print("[");
            Arrays.stream(row).forEach(element -> System.out.print(" " + element + " "));
            System.out.println("]");
        });
    }

    static int[][] boxBlur(int[][] image) {
        int resultElement = 0;
        int resultXCoord = 0;
        int resultYCoord = 0;
        int[][] blurredImage = new int[image.length - 2][image[0].length - 2];
        for (int col = 1; col < image.length - 1; col++) {
            for (int row = 1; row < image[0].length - 1; row++) {
                resultElement =
                                image[col - 1][row - 1] + image[col - 1][row] + image[col - 1][row + 1] +
                                image[col][row - 1] + image[col][row] + image[col][row + 1] +
                                image[col + 1][row - 1] + image[col + 1][row] + image[col + 1][row + 1];
                blurredImage[resultYCoord][resultXCoord] = resultElement / 9;
                if (resultXCoord < blurredImage[0].length - 1) {
                    resultXCoord++;
                } else {
                    resultYCoord++;
                    resultXCoord = 0;
                }
            }
        }
        return blurredImage;
    }
}

