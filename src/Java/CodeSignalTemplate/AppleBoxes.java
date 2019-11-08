package CodeSignalTemplate;

public class AppleBoxes {
    public static void main(String[] args) {
        int k = 5;
        System.out.println(appleBoxes(k));
    }

    static int appleBoxes(int k) {
        int numberOfYellowApples = 0;
        int numberOfRedApples = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 2 != 0) {
                numberOfYellowApples += i * i;
            } else {
                numberOfRedApples += i * i;
            }
        }
        return numberOfRedApples-numberOfYellowApples;
    }
}
