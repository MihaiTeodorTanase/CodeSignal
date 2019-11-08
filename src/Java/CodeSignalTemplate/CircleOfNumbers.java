package CodeSignalTemplate;

import java.util.LinkedList;
import java.util.List;

public class CircleOfNumbers {
    public static void main(String[] args) {
        int n = 10;
        int firstNumber = 3;
        System.out.println(circleOfNumbers(n, firstNumber));
    }

    static int circleOfNumbers(int n, int firstNumber) {
        if (firstNumber == n / 2) {
            return 0;
        } else if (firstNumber > n / 2) {
            return firstNumber - n / 2;
        } else {
            return firstNumber + n / 2;
        }
    }
}
