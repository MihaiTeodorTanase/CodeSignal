package CodeSignalTemplate;

public class LongestDigitsPrefix {
    public static void main(String[] args) {

    }
    String longestDigitsPrefix(String inputString) {
        char[] inputCharArray = inputString.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean wasDigit=false;
        if(inputString.charAt(0)==' '){
            return "";
        }
        for(char i : inputCharArray){
            if(Character.isDigit(i)){
                wasDigit = true;
                sb.append(i);
            }else{
                if(wasDigit){
                    break;
                }
            }
        }
        return sb.toString();
    }
}
