package CodeSignalTemplate;

import java.nio.charset.Charset;

public class ChessBoardCellCollector {
    public static void main(String[] args) {
        String cell1 = "A1";
        String cell2 = "B2";
        System.out.println(chessBoardCellColor(cell1, cell2));
    }

    static boolean chessBoardCellColor(String cell1, String cell2) {
        String colorCell1 = getColorOfCell(cell1);
        String colorCell2 = getColorOfCell(cell2);

        return colorCell1.equals(colorCell2);
    }

    private static String getColorOfCell(String cell) {
        String oddLetterCoords = "ACEG";
        String oddDigitCoords = "1357";
        String colorCell1;

        if (oddLetterCoords.contains(cell.charAt(0) + "")) {
            if (oddDigitCoords.contains(cell.charAt(1) + "")) {
                colorCell1 = "black";
            } else {
                colorCell1 = "white";
            }
        } else {
            if (oddDigitCoords.contains(cell.charAt(1) + "")) {
                colorCell1 = "white";
            } else {
                colorCell1 = "black";
            }
        }
        return colorCell1;
    }
}
