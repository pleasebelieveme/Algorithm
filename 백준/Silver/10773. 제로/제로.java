import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        // 성능을 위해 ArrayDeque를 스택으로 활용
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                stack.pop(); // 0이면 최근 숫자 제거
            } else {
                stack.push(num); // 0이 아니면 추가
            }
        }
        
        long sum = 0; // 합계는 안전하게 long 타입
        for (int n : stack) {
            sum += n;
        }
        
        System.out.println(sum);
    }
}