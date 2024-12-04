package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class N1152_단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();

        String[] arr = A.trim().split("\\s+");
        if (A.trim().isEmpty()) { // 입력이 빈 문자열인 경우
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}

