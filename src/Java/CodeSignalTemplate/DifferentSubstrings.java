package CodeSignalTemplate;

import java.util.ArrayList;
import java.util.List;

public class DifferentSubstrings {
    public static void main(String[] args) {
        String input = "abac";
        System.out.println(differentSubstringsTrie(input));
    }

    static int differentSubstringsTrie(String inputString) {
        int differentSubstringsCounter=1;
        String stringToWorkWith;
        List<String> substringsToWorkWith = new ArrayList<>();
        List<String> notUniqueSubstrings = new ArrayList<>();
        int numberOfLetters = 1;
        while (numberOfLetters < inputString.length()) {
            stringToWorkWith=inputString;
            substringsToWorkWith.clear();
            while (stringToWorkWith.length() >= numberOfLetters) {
                substringsToWorkWith.add(stringToWorkWith.substring(0,numberOfLetters));
                stringToWorkWith = stringToWorkWith.substring(1);
            }
            for (int i = 0; i < substringsToWorkWith.size(); i++) {
                if (!notUniqueSubstrings.contains(substringsToWorkWith.get(i))) {
                    for (int j = 0; j < substringsToWorkWith.size(); j++) {
                        if (substringsToWorkWith.get(i).equals(substringsToWorkWith.get(j)) && i != j) {
                            notUniqueSubstrings.add(substringsToWorkWith.get(i));
                        }
                    }
                    differentSubstringsCounter++;
                }
            }
            numberOfLetters++;
        }
        return differentSubstringsCounter;
    }
}
