import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        double sqrt = Math.sqrt(n); // 제곱근을 미리 계산

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                list.add(i); // 나누어지는 수(i) 추가
                
                // 짝꿍 약수(n/i)도 추가 (중복 방지: i가 n/i와 다를 때만)
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        // 약수를 짝꿍과 함께 넣었으므로 정렬이 필수입니다.
        Collections.sort(list);

        // 리스트를 배열로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}