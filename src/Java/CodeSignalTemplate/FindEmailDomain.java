package CodeSignalTemplate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEmailDomain {
    public static void main(String[] args) {
        String input = "\\\"very.unusual.@.unusual.com\\\"@usual.com";
        System.out.println(findEmailDomain(input));
    }

    static String findEmailDomain(String address) {
        Pattern pattern = Pattern.compile("@.{1,}");
        Matcher matcher;
        while (address.contains("@")) {
            matcher = pattern.matcher(address);
            if (matcher.find()) {
                address = matcher.group().substring(1);
                matcher.reset();
            }
        }
        return address;
    }
}
