import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break; // 종료 조건

            System.out.println(solve(line) ? "yes" : "no");
        }
    }

    public static boolean solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 1. 여는 괄호는 스택에 push
            if (c == '(' || c == '[') {
                stack.push(c);
            } 
            // 2. 닫는 소괄호
            else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') return false;
                stack.pop();
            } 
            // 3. 닫는 대괄호
            else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') return false;
                stack.pop();
            }
        }
        // 최종적으로 스택이 비어있어야 'yes'
        return stack.empty();
    }
}