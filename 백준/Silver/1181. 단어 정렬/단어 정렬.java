import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 1. 중복 제거
        Set<String> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            set.add(sc.next());
        }

        // 2. List로 변환
        List<String> list = new ArrayList<>(set);

        // 3. 정렬
        Collections.sort(list, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length(); // 길이 오름차순
            }
            return a.compareTo(b); // 사전순
        });

        // 4. 출력
        for (String word : list) {
            System.out.println(word);
        }
    }
}
