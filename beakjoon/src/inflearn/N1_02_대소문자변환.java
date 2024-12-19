package inflearn;

import java.util.Scanner;

class N1_02_대소문자변환 {
    public String solution(String str) {
        String answer = "";

//        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
//        }
        for (char x : str.toCharArray()) {
            if(x >= 65 && x <= 90) answer += (char)(x+32);
            else answer += (char)(x-32); // 97 ~ 122 소문자
        }
        return answer;
    }

    public static void main(String[] args) {
        N1_02_대소문자변환 T = new N1_02_대소문자변환();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
