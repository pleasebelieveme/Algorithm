package kosta;

import java.util.Arrays;

// 1부터 3까지의 수중 3개를 중복되지 않게 뽑아 순서적으로 나열
public class PermutationTest {
    static int N = 4;
    public static void main(String[] args) {
        //permutation1();
        numbers = new int[N];
        isSelected = new boolean[N + 1];
        permutation2(0);
    }
    public static void permutation1() { // loop
        for (int i = 1; i <= N; i++) { //첫번째 자리
            for (int j = 1; j <= N; j++) { // 두번째자리
                if(i==j) continue;
                for (int k = 1; k <= N; k++) { //세번째자리
                    if(i==k || j==k) continue;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    static int[] numbers; //각자리의 뽑힌 수를 저장
    static boolean[] isSelected; // 해당수가 사용중인지 여부
    public static void permutation2(int cnt) {
        if(cnt == N){ // 다 뽑았으면..
            System.out.println(Arrays.toString(numbers));
            return;
        };

        for (int i = 1; i <= N; i++) {
            // 이전 자리의 수들과 중복 체크
            if(isSelected[i]) continue;
            numbers[cnt] = i; // 현재자리에 선택한 수 저장
            isSelected[i] = true; // 선택한 수의 사용여부 플래그 처리
            permutation2(cnt + 1); // 다음자리의 수 뽑기
            isSelected[i] = false; // 선택한 수의 사용여부 플래그 되돌리기
        }
    }
}//class

