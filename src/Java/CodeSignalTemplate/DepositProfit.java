package CodeSignalTemplate;

public class DepositProfit {
    public static void main(String[] args) {
        int deposit = 100;
        int rate = 20;
        int threshold = 170;
        System.out.println(depositProfit(deposit,rate,threshold));
    }

    static int depositProfit(int deposit, int rate, int threshold) {
        double temp = (double)deposit;
        int counter = 0;
        while(temp<threshold){
            temp += temp*(double) rate/100;
            counter++;
        }
        return counter;
    }
}
