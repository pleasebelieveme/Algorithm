package inflearn;

import java.util.Scanner;

public class N1_03_문장속단어 {
    public String solution(String[] strArr) {
        String answer = strArr[0];
//        int max = Integer.MIN_VALUE; // -2147483648
        for (int i = 0; i < strArr.length; i++) {
            if (answer.length() < strArr[i].length()) answer = strArr[i];
//            System.out.println("answer = " + answer);
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int max = Integer.MAX_VALUE, pos;
        while((pos = str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        N1_03_문장속단어 T = new N1_03_문장속단어();
        Scanner kb = new Scanner(System.in);
        String[] strArr = kb.nextLine().split(" ");
        System.out.println(T.solution(strArr));
    }
}
