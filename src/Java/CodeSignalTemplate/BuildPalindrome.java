package CodeSignalTemplate;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

public class BuildPalindrome {
    public static void main(String[] args) {
        String st = "abcdc";
        System.out.println(buildPalindrome(st));
    }

    static String buildPalindrome(String st) {
        List<Character> pendingChars = new LinkedList<>();
        if (!isPalindrome(st)) {
            StringBuilder sb = new StringBuilder();
            sb.append(st);
            for (int i = 0; i < st.length(); i++) {
                pendingChars.add(0,st.charAt(i));
                pendingChars.forEach(sb::append);
                if (isPalindrome(sb.toString())) {
                    return sb.toString();
                } else {
                    sb.setLength(0);
                    sb.append(st);
                }
            }
        }
        return st;
    }

    static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        reverse = sb.toString();
        if (reverse.equals(input)) {
            return true;
        }
        return false;
    }
}
