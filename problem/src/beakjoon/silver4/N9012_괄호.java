package beakjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N9012_괄호 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        T:  for (int tc = 0; tc < TC; ++tc) {
            char[] exp = in.readLine().toCharArray();
            stack = new Stack<>();

            for (char ch : exp) {
                // 여는 괄호
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    // 닫는 괄호
                    if (stack.isEmpty()) {
                        sb.append("NO").append("\n");
                        continue T;
                    }
                    stack.pop();
                    //if(pair == '(' && ch == ')')
                }
            }//for
            sb.append(stack.isEmpty()?"YES":"NO").append("\n");
        }//for
        System.out.println(sb.toString());
    }
}
