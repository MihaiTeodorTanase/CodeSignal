package CodeSignalTemplate;

public class ArrayMaxConsecutiveSum {
    public static void main(String[] args) {
        int[] input = {2, 3, 5, 1, 6};
        int k = 2;
        System.out.println(arrayMaxConsecutiveSum(input, k));
    }

    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int outputSum=0;
        int pendingSum = 0 ;
        for (int i = 0; i < inputArray.length - k+1; i++){
            int counter = k;
            int j=i;
            while(counter > 0){
                pendingSum += inputArray[j];
                counter--;
                j++;
            }
            if(outputSum<pendingSum){
                outputSum=pendingSum;
            }
            pendingSum = 0 ;
        }
        return  outputSum;
    }
}
