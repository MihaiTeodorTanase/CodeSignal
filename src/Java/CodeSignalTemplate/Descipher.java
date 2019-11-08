package CodeSignalTemplate;

import java.util.HashMap;
import java.util.Map;

public class Descipher {
    public static void main(String[] args) {
        String input = "10197115121";
        System.out.println(decipher(input));
    }

    static String decipher(String cipher) {
        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetLetters = alphabet.toCharArray();
        Map<String, Character> codesOfLetters = new HashMap<>();
        int letterCode = 97;
        for (char letter : alphabetLetters) {
            codesOfLetters.put("" + letterCode++, letter);
        }
        int lastIndex;
        while (cipher.length() > 0) {
            lastIndex = 2;
            if (Integer.valueOf(cipher.substring(0, lastIndex)) < 97) {
                lastIndex = 3;
            }
            sb.append(codesOfLetters.get(cipher.substring(0, lastIndex)));
            cipher = cipher.substring(lastIndex);
        }
        return sb.toString();
    }
}
