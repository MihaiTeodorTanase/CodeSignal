package CodeSignalTemplate;

import java.util.Arrays;

public class ChessKnight {
    public static void main(String[] args) {
        String input = "a1";
        System.out.println(chessKnight(input));
    }

    static int chessKnight(String cell) {
        int movesCounter = 0;
        int moveCoordY;
        int moveCoordX;
        String chessBoardX = "abcdefgh";
        int[][] chessBoard = new int[8][8];
        Arrays.stream(chessBoard).forEach(line -> Arrays.stream(line).forEach(square -> square = 1));
        int knightX = chessBoardX.indexOf(cell.charAt(0));
        int knightY = Integer.valueOf(cell.charAt(1) + "") - 1;
        int[][] coordsForTiles = {{-2, -1}, {-1, -2}, {-2, 1}, {-1, 2}, {2, -1}, {1, -2}, {2, 1}, {1, 2}};

        for (int[] coords : coordsForTiles) {
            try {
                moveCoordY = coords[0];
                moveCoordX = coords[1];
                chessBoard[knightY + moveCoordY][knightX + moveCoordX] = 2;
                movesCounter++;
            } catch (IndexOutOfBoundsException ignored) {
            }
        }
        return movesCounter;
    }
}
