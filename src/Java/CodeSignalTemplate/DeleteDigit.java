package CodeSignalTemplate;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

public class DeleteDigit {
    public static void main(String[] args) {
        int input = 222250;
        System.out.println(deleteDigit(input));
    }

    static int deleteDigit(int n) {
        int input = n;
        int lowestDigit = 9;
        int secondLowestDigit = 9;
        int currentDigit;
        boolean flagLowestDigit = true;
        boolean flagSecondLowestDigit = true;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<Integer> listOfDigits = new LinkedList<>();

        while (input != 0) {
            currentDigit = input%10;
            listOfDigits.add(currentDigit);
            if (currentDigit < lowestDigit) {
                secondLowestDigit = lowestDigit;
                lowestDigit = currentDigit;
            }
            if(currentDigit>lowestDigit && currentDigit < secondLowestDigit){
                secondLowestDigit=currentDigit;
            }
            input /= 10;
        }
        for (int i = listOfDigits.size() - 1; i >= 0; i--) {
            if (listOfDigits.get(i) == lowestDigit && flagLowestDigit) {
                flagLowestDigit = false;
            } else {
                sb.append(listOfDigits.get(i));
            }
            if (listOfDigits.get(i) == secondLowestDigit && flagSecondLowestDigit) {
                flagSecondLowestDigit = false;
            } else {
                sb2.append(listOfDigits.get(i));
            }
        }
        if (Integer.valueOf(sb.toString()) > Integer.valueOf(sb2.toString())) {
            return Integer.valueOf(sb.toString());
        }
        return Integer.valueOf(sb2.toString());
    }
}
