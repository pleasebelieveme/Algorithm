import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            int current = numbers[i];
            
            // 스택에서 현재 숫자보다 작거나 같은 값은 뺀다
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }
            
            // 스택이 비었으면 뒷 큰수가 없음
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            
            // 현재 숫자를 스택에 push
            stack.push(current);
        }
        
        return answer;
    }
}
