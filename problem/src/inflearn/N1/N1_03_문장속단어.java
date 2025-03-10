package inflearn.N1;

import java.util.Scanner;

public class N1_03_문장속단어 {
    public String solution(String[] strArr) {
        String answer = strArr[0];
//        int max = Integer.MIN_VALUE; // -2147483648
        for (int i = 0; i < strArr.length; i++) {
            if (answer.length() < strArr[i].length()) answer = strArr[i];
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' '))!=-1){ // 빈문자열이 나오면 위치값 반환
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // 빈문자열 자르기
        }
        if(str.length() > max) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        N1_03_문장속단어 T = new N1_03_문장속단어();
        Scanner kb = new Scanner(System.in);
//        String[] strArr = kb.nextLine().split(" ");
//         System.out.println(T.solution(strArr));
        String str = kb.nextLine();
        System.out.println(T.solution2(str));
    }
}
