package CodeSignalTemplate;

public class LineEncoding {
    public static void main(String[] args) {
        String input = "abbcabb";
        System.out.println(lineEncoding(input));
    }

    static String lineEncoding(String s) {
        StringBuilder sb = new StringBuilder();
        char previousChar = s.charAt(0);
        int counterOfChars = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == previousChar) {
                counterOfChars++;
                if (i + 1 == s.length()) {
                    if (counterOfChars != 1) {
                        sb.append(counterOfChars);
                    }
                    sb.append(previousChar);
                }
            } else {
                if (counterOfChars != 1) {
                    sb.append(counterOfChars);
                }
                sb.append(previousChar);
                counterOfChars = 1;
                previousChar = s.charAt(i);
                if (i + 1 == s.length()) {
                    sb.append(previousChar);
                }
            }
        }
        return sb.toString();
    }
}
