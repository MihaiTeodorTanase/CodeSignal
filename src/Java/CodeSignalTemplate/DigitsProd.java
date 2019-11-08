package CodeSignalTemplate;

import java.util.LinkedList;
import java.util.List;

public class DigitsProd {
    public static void main(String[] args) {
        int input = 484;
        System.out.println(digitsProduct(input));
    }

    static int digitsProduct(int product) {
        List<Integer> output = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int stuckHelper;
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if(product == 0 ){
            return 10;
        }
        if(product == 1){
            return 1;
        }
        if (!isPrime(product)) {
            while (product != 1) {
                stuckHelper=0;
                for (int i = digits.length - 1; i >= 0; i--) {
                    if (product % digits[i] == 0) {
                        output.add(0, digits[i]);
                        product /= digits[i];
                        break;
                    }
                    else{stuckHelper++;}
                    if(stuckHelper==8){
                        return -1;
                    }
                }
            }
            if (!output.isEmpty()) {
                output.forEach(sb::append);
                return Integer.valueOf(sb.toString());
            }
        }
        else{
            if (product<11){
                return product;
            }
        }
        return -1;
    }

    static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
