package CodeSignalTemplate;

public class DistinctDistances {
    public static void main(String[] args) {
        int[] input = {3, 4, 5};
        System.out.println(distinctDistances(input));
    }

    static int distinctDistances(int[] distances) {
        return distances[0]+distances[1]>=distances[2] ? 3 : 4;
    }
}
