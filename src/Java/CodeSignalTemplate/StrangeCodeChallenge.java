package CodeSignalTemplate;

public class StrangeCodeChallenge {
    public static void main(String[] args) {
        int s = 4;
        int e = 8;
        System.out.println(strangeCode(s, e));
    }

    static String strangeCode(int s, int e) {
        StringBuilder sb = new StringBuilder();
        while (s < e - 1) {
            s++;
            e--;
            if (sb.length()==0 || sb.charAt(sb.length()-1)=='b') {
                sb.append('a');
            } else {
                sb.append('b');
            }
        }
        return sb.toString();
    }
}
