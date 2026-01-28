import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            String answer = "yes";
            char[] c = String.valueOf(n).toCharArray();
            for (int i=0; i<c.length/2; i++) {
                if (c[i] != c[c.length-i-1]) {
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
