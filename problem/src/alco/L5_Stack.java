package alco;

import java.util.Stack;

// Last In First Out(LIFO)
// push : 요소하나 넣기
// pop : 요소하나 빼기
// peek : 요소 하나 확인하기 => 모두 시간복잡도는 O(1)
public class L5_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 4
        System.out.println(stack.peek()); // 3 확인만
        System.out.println(stack.size()); // 3
        System.out.println(stack.isEmpty()); // false
    }
}
