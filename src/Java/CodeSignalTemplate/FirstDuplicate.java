package CodeSignalTemplate;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] input = {8, 1, 4, 8, 10, 1, 5, 7, 8, 7};
        System.out.println(firstDuplicate(input));
    }

    static int firstDuplicate(int[] a) {
        for(int i=0;i<a.length;i++)
            if(a[Math.abs(a[i])-1]<0)
                return Math.abs(a[i]);
            else{
                a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
            }
        return -1;
    }
}
