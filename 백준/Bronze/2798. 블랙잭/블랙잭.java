import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int sum = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N];
        

        for(int i=0; i<N; i++) {
            list[i] = sc.nextInt();
        }

        for(int i=0; i<N-2; i++) {
            for(int j=i+1; j<N-1; j++) {
                for(int k=j+1; k<N; k++) {
                    sum = list[i] + list[j] + list[k];
                    if(sum > M) continue;
                    if (sum == M) {
                        System.out.println(M);
                        return;
                    }
                    if(sum > answer) answer = sum;
                }
            }
        }
        System.out.println(answer);
    }
}
