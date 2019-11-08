package CodeSignalTemplate;

public class AlphabeticShift {
    public static void main(String[] args) {
        String a = "crazy";
        System.out.println(alphabeticShift(a));
    }

    static String alphabeticShift(String inputString) {
        StringBuilder sb = new StringBuilder();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'z') {
                sb.append('a');
                continue;
            }
            for (int j = 0; j < alphabet.length; j++) {
                 if (inputString.charAt(i) == alphabet[j]) {
                    sb.append(alphabet[j + 1]);
                }
            }
        }
        return sb.toString();
    }
}
