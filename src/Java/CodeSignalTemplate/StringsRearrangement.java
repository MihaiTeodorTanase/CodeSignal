package CodeSignalTemplate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringsRearrangement {
    public static void main(String[] args) {
        String[] inputArray = {"ab",
                "bb",
                "aa"};
        System.out.println(stringsRearrangement(inputArray));

    }


    static boolean stringsRearrangement(String[] inputArray) {
        return permuteHelper(inputArray, 0);
    }

    private static boolean permuteHelper(String[] arr, int index) {
        for (int i = index; i < arr.length; i++) {
            String t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            if (permuteHelper(arr, index + 1)) {
                return true;
            } else {
                t = arr[index];
                arr[index] = arr[i];
                arr[i] = t;
            }
        }
        if (index >= arr.length) {
            if (checkArrayOfStrings(arr)) {
                return true;
            }
        }
        return false;
    }

    static boolean checkArrayOfStrings(String[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (!compareStrings(inputArray[i], inputArray[i + 1])) {
                return false;
            }
        }
        return true;
    }

    static boolean compareStrings(String str1, String str2) {
        int differencesCounter = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                differencesCounter++;
                if (differencesCounter > 1) {
                    return false;
                }

            }
        }
        if (differencesCounter == 0) {
            return false;
        }
        return true;
    }
}
