package beakjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N16938_캠프준비 {
    static int N, L, R, X, ans;
    static int ex[];
    public static void main(String[] args) throws IOException {
        // 부분집합을 모두하면 = 조합
        // 다해보는 건 시간계산이 필요하다
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        ex = new int[N];
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            ex[i] = Integer.parseInt(st.nextToken());
        }//문제난이도

        makeTest(0, 0, 0, Integer.MAX_VALUE, 0);
        System.out.println(ans);
    }

    // power set
    // 기존까지 고려한 문제수, 선택한 문제들의 난이도 합, 선택한 문제들 중 난이도 최소, 선택한 문제들 중 난이도 최대
    static void makeTest(int cnt, int selectCnt, int sum, int min, int max) {
        if(cnt==N) {
            if(selectCnt>=2 && sum>=L && sum<=R && max-min>=X) ++ans;
            return;
        }
        // 해당 문제를 선택
        makeTest(cnt+1, selectCnt+1,sum+ex[cnt], Math.min(min, ex[cnt]), Math.max(max, ex[cnt]));
        // 해당 문제를 비선택
        makeTest(cnt+1, selectCnt, sum, min, max);

    }
}
