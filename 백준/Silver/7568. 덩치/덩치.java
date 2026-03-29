import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] people = new int[N][2];

        for(int i = 0; i < N; i++) {
            people[i][0] = sc.nextInt(); // 몸무게
            people[i][1] = sc.nextInt(); // 키
        }

        for(int i = 0; i < N; i++) {
            int rank = 1; // 기본은 1등부터 시작
            for(int j = 0; j < N; j++) {
                if(i == j) continue; // 나 자신과는 비교 안 함
                
                // 나보다 몸무게와 키가 모두 큰 사람이 있다면
                if(people[j][0] > people[i][0] && people[j][1] > people[i][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}