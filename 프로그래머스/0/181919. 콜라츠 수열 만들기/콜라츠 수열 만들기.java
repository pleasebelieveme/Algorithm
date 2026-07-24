import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        // 콜라츠 문제(실생활에서는 쓰이지 않음)
        List<Integer> list = new ArrayList<>();
        
        list.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}