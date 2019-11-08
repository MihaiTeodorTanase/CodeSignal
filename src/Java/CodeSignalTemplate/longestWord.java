package CodeSignalTemplate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class longestWord {
    public static void main(String[] args) {
        String text = "ab-CDE-fg_hi";
        System.out.println(longestWord(text));
    }

    static String longestWord(String text) {
        String output = "";
        String regex = "[a-zA-Z]{1,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            {
                if (matcher.group().length() > output.length()) {
                    output = matcher.group();
                }
            }
        }
        return output;
    }
}
