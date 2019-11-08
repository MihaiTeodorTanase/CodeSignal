package CodeSignalTemplate;

import java.util.Arrays;

public class AvoidObstacles {
    public static void main(String[] args) {
        int[] a = {5, 3, 6, 7, 9};
        System.out.println(avoidObstacles(a));
    }
    static int avoidObstacles(int[] inputArray) {
        int jumpLength = 1;
        int jumper = 0;
        boolean flag = true;
        Arrays.sort(inputArray);
        while(flag){
            jumper +=jumpLength;
            for (int obstacle : inputArray){
                if(obstacle == jumper){
                    jumpLength++;
                    jumper=0;
                    break;
                }
                if(jumper < obstacle){
                    break;
                }
                if(jumper > inputArray[inputArray.length-1]){
                    flag = false;
                }
            }
        }
        return jumpLength;
    }

}
