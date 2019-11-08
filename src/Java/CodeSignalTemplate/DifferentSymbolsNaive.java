package CodeSignalTemplate;

import java.util.LinkedList;
import java.util.List;

public class DifferentSymbolsNaive {
    public static void main(String[] args) {
        String input = "cabca";
        differentSymbolsNaive(input);
    }

    static int differentSymbolsNaive(String s) {
        List<Character> uniqueChars = new LinkedList<>();
        char[] charArrays = s.toCharArray();
        for (char i : charArrays) {
            if(!uniqueChars.contains(i)){
               uniqueChars.add(i);
            }
        }
        return uniqueChars.size();
    }
}
