package CodeSignalTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class IsBeautifulString {
    public static void main(String[] args) {
        String input = "abb";
        System.out.println(isBeautifulString(input));
    }

    static boolean isBeautifulString(String inputString) {
        int counter = 0;
        int previousCounter = Integer.MAX_VALUE;

        List<Character> characterList = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.sort(characterList);
        char previousChar=characterList.get(0);

        List<Character> alphabet = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        char lastCharacter = characterList.get(characterList.size()-1);
        for(int i = 0 ; i < alphabet.indexOf(lastCharacter);i++){
            if(!characterList.contains(alphabet.get(i))){
                return false;
            }
        }

        for(int i = 0 ; i < characterList.size() ; i++){
            if(characterList.get(i)!= previousChar){
                previousCounter=counter;
                counter = 0;
                previousChar=characterList.get(i);
                counter++;

            }else {
                counter++;
                previousChar=characterList.get(i);
                if(counter>previousCounter){
                    return false;
                }
            }
        }
        return true;
    }
}
