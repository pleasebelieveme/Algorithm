package game;

import java.io.*;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        String M = st.nextToken();
        System.out.println("N = " + N);
        System.out.println("M = " + M);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        String str = "abcdef"; // 출력할 문자열
        bw.write(N); // 출력
        bw.newLine(); // 줄바꿈
        bw.write(M);
        bw.flush(); // 남아있는 데이터 모두 출력
        bw.close();


    }
}
