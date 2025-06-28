import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int ing : ingredient) {
            stack.push(ing);

            // 스택의 마지막 4개가 "1231"인지 확인
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 1) == 1) {

                    // 햄버거 패턴을 발견하면 제거
                    stack.pop(); // 1
                    stack.pop(); // 3
                    stack.pop(); // 2
                    stack.pop(); // 1
                    answer++;
                }
            }
        }
        return answer;
    }
}
