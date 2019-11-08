package CodeSignalTemplate;

public class AbsoluteValuesSumMinimalization {
    public static void main(String[] args) {
        int[] a = {2, 4, 7};
        System.out.println(absoluteValuesSumMinimization(a));
    }

    static int absoluteValuesSumMinimization(int[] a) {
        int resultOfEcuation = 0;
        int finalResult = Integer.MAX_VALUE;
        int closestElement = 0;

        for (int i = 0; i < a.length; i++) {
            for (int temp : a) {
                resultOfEcuation += Math.abs(temp - a[i]);
            }
            if (resultOfEcuation < finalResult) {
                finalResult = resultOfEcuation;
                closestElement = a[i];
            }
            resultOfEcuation = 0;
        }
        return closestElement;
    }
}
