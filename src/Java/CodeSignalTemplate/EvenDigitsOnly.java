package CodeSignalTemplate;

public class EvenDigitsOnly {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(evenDigitsOnly(i));
    }
    static boolean evenDigitsOnly(int n) {
        boolean flag = true;
        while(n!=0){
            if(n%10%2!=0){
                flag = false;
            }
            n/=10;
        }
        return flag;
    }
}
