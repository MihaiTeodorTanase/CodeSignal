package CodeSignalTemplate;

import java.util.Arrays;
import java.util.regex.Pattern;

public class IsIPv4Address {
    public static void main(String[] args) {
        String a = "129380129831213981.255.255.255";
        System.out.println(isIPv4Address(a));
    }

    static boolean isIPv4Address(String inputString) {
        Pattern pattern = Pattern.compile("(\\d{1,}\\.){3}\\d{1,}");
        if (pattern.matcher(inputString).matches()) {
            String[] temp = inputString.split("\\.");
            for (int i = 0; i < temp.length; i++) {
                try {
                    if (Integer.parseInt(temp[i]) > 255 | Integer.parseInt(temp[i]) < 0) {
                        return false;
                    }
                } catch (NumberFormatException e){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}

