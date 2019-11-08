package CodeSignalTemplate;

public class FirstDigit {
    public static void main(String[] args) {
        String input = "var_1__Int";
        System.out.println(firstDigit(input));
    }

    static char firstDigit(String inputString) {
        char[] charArray = inputString.toCharArray();
        for (char i : charArray) {
            if(Character.isDigit(i)){
                return i;
            }
        }
        return ' ';
    }
}
