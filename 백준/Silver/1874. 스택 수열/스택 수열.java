import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] sequence = new int[N]; // 요구한 수열 저장
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int nextNum = 1;

        for (int i = 0; i < N; i++) {
            int target = sequence[i];

            // 1. 타겟 숫자를 만날 때까지 스택에 push
            while (nextNum <= target) {
                stack.push(nextNum++);
                sb.append("+\n");
            }

            // 2. 스택의 Top이 타겟과 일치하는지 검증
            if (stack.isEmpty() || stack.peek() != target) {
                // [Early Return] 실패 시 즉시 종료
                System.out.println("NO");
                return; 
            }

            // 3. 일치한다면 pop
            stack.pop();
            sb.append("-\n");
        }

        System.out.print(sb);
    }
}