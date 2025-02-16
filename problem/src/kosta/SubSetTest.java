package kosta;

import java.util.Scanner;

public class SubSetTest {
    static int N;
    static int[] input;
    static boolean[] isSelected;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        input = new int[N];
        isSelected = new boolean[N]; // 배열의 각 인덱스위치에 해당하는 수가 부분집합 구성에 포함되었는지 여부
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        makeSubSet(0);
    }
    private static void makeSubSet(int idx) {
        if(idx==N) {
            for (int i = 0; i < N; i++) {
                if(isSelected[i]) System.out.print(input[i] + " ");
                else System.out.print("X ");
            }
            System.out.println();
            return;
        }
        isSelected[idx] = true;
        makeSubSet(idx+1);
        isSelected[idx] = false;
        makeSubSet(idx+1);

    }
}
