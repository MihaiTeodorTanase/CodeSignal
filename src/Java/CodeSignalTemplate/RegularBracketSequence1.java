package CodeSignalTemplate;

import java.util.regex.Pattern;

public class RegularBracketSequence1 {
    public static void main(String[] args) {
        String test = "(()))";
        System.out.println(regularBracketSequence1(test));
    }

    static boolean regularBracketSequence1(String sequence) {
        String oldSequence = sequence;
        if (sequence.indexOf(0) == ')') {
            return false;
        }
        String regex = "(\\(\\))";
        while (true) {
            sequence = sequence.replaceAll(regex, "");
            if (sequence.isEmpty()) {
                return true;
            }
            if (oldSequence == sequence) {
                return false;
            } else {
                oldSequence = sequence;
            }
        }
    }
}
