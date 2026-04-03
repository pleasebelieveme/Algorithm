import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 대량의 데이터를 순차적으로 추가하고 앞, 뒤만 사용할때는 ArrayDeque가 유리
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        
        while (q.size() > 1) {
            q.poll();         
            q.offer(q.poll());
        }
        
        System.out.println(q.poll());
    }
}