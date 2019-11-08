package CodeSignalTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BishopAndPawn {
    public static void main(String[] args) {
        String bishop = "h1";
        String pawn = "h3";
        System.out.println(bishopAndPawn(bishop, pawn));
    }

    static boolean bishopAndPawn(String bishop, String pawn) {
        int[][] chessBoard = new int[8][8];
        Map<Character, Integer> chessBoardCharacterToInt = getMapOfChessBoardX();
        int bishopX = chessBoardCharacterToInt.get(bishop.charAt(0)) - 1;
        int bishopY = Integer.valueOf(bishop.charAt(1) + "") - 1;
        int pawnX = chessBoardCharacterToInt.get(pawn.charAt(0)) - 1;
        int pawnY = Integer.valueOf(pawn.charAt(1) + "") - 1;
        Arrays.stream(chessBoard).forEach(line -> Arrays.stream(line).forEach(tile -> tile = 1));
        chessBoard[pawnX][pawnY] = 3;

        if (isPawnInRange(chessBoard, bishopX, bishopY)) {
            return true;
        }
        return false;
    }

    private static Map<Character, Integer> getMapOfChessBoardX() {
        Map<Character, Integer> chessBoardCharacterToInt = new HashMap<>();
        chessBoardCharacterToInt.put('a', 1);
        chessBoardCharacterToInt.put('b', 2);
        chessBoardCharacterToInt.put('c', 3);
        chessBoardCharacterToInt.put('d', 4);
        chessBoardCharacterToInt.put('e', 5);
        chessBoardCharacterToInt.put('f', 6);
        chessBoardCharacterToInt.put('g', 7);
        chessBoardCharacterToInt.put('h', 8);
        return chessBoardCharacterToInt;
    }

    private static boolean isPawnInRange( int[][] chessBoard, int bishopX, int bishopY) {
        int checkedBishopDiagonals = 0;
        while (checkedBishopDiagonals < 4) {
            try {
                int i = bishopX;
                int j = bishopY;
                while (true) {
                    if (checkedBishopDiagonals == 0) {
                        if (chessBoard[++i][++j] == 3) {
                            return true;
                        }
                    }
                    if (checkedBishopDiagonals == 1) {
                        if (chessBoard[--i][++j] == 3) {
                            return true;
                        }
                    }
                    if (checkedBishopDiagonals == 2) {
                        if (chessBoard[++i][--j] == 3) {
                            return true;
                        }
                    }
                    if (checkedBishopDiagonals == 3) {
                        if (chessBoard[--i][--j] == 3) {
                            return true;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                checkedBishopDiagonals++;
            }
        }
        return false;
    }
}
