package kosta;

import java.util.Arrays;
import java.util.Scanner;

// 주사위 던지기
public class DiceTest {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 주사위 던진 횟수 (뽑는 횟수)
        int M = sc.nextInt(); // 주사위 던지기 모드
        numbers = new int[N];
        switch (M) {
            case 1: { // 중복순열
            dice1(0); break;
            }
            case 2: { // 순열
                isSelected = new boolean[7]; // 1~6까지의 사용여부
                dice2(0); break;
            }
            case 3: { // 중복포함조합
                dice3(0, 1); break;
            }
            case 4: { //조합
                dice4(0, 1); break;
            }
        }
    }
    public static void dice1(int cnt) {
        if(cnt == N){ // 다 뽑았으면..
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for (int i = 1; i <= 6; i++) {
            numbers[cnt] = i; // 현재자리에 선택한 수 저장
            dice1(cnt + 1); // 다음자리의 수 뽑기
        }

    }
    static int[] numbers; //각자리의 뽑힌 수를 저장
    static boolean[] isSelected; // 해당수가 사용중인지 여부
    public static void dice2(int cnt) {
        if(cnt == N){ // 다 뽑았으면..
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for (int i = 1; i <= 6; i++) {
            // 이전 자리의 수들과 중복 체크
            if(isSelected[i]) continue;
            numbers[cnt] = i; // 현재자리에 선택한 수 저장
            isSelected[i] = true; // 선택한 수의 사용여부 플래그 처리
            dice2(cnt + 1); // 다음자리의 수 뽑기
            isSelected[i] = false; // 선택한 수의 사용여부 플래그 되돌리기
        }
    }

    public static void dice3(int cnt, int start) { //중복조합
        if(cnt == N){ // 다 뽑았으면..
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for (int i = start; i <= 6; i++) {
            numbers[cnt] = i; // 현재자리에 선택한 수 저장
            dice4(cnt+1, i); // 다음자리의 수 뽑기
        }
    }

    public static void dice4(int cnt, int start) { //조합
        if(cnt == N){ // 다 뽑았으면..
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for (int i = start; i <= 6; i++) {
            numbers[cnt] = i; // 현재자리에 선택한 수 저장
            dice4(cnt+1, i+1); // 다음자리의 수 뽑기
        }
    }
}//class

