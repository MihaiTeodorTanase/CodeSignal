package CodeSignalTemplate;

import java.util.Arrays;

public class RobotPath {
    public static void main(String[] args) {
    String instructions = "LLLLUUUUDR";
    int bound = 2;
        Arrays.stream(robotPath(instructions,bound)).forEach(System.out::print);
    }
    static int[] robotPath(String instructions, int bound) {
        int firstCoord=0;
        int secondCoord=0;
        char[] arrayOfInstructions = instructions.toCharArray();
        for(char instruction : arrayOfInstructions){
            switch(instruction){
                case 'L':
                    if(!(firstCoord-1<-bound)){
                       firstCoord--;
                    }
                break;
                case 'R':
                    if(!(firstCoord+1>bound)){
                        firstCoord++;
                    }
                break;
                case 'U':
                    if(!(secondCoord+1>bound)){
                        secondCoord++;
                    }
                break;
                case 'D':
                    if(!(secondCoord-1<-bound)){
                        secondCoord--;
                    }
                break;
            }
        }
        return new int[]{firstCoord,secondCoord};
    }
}
