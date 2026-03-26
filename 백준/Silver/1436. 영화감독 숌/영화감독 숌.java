import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = 666;
        int count = 1;

        while (count != N) {
            num++; // 숫자를 1씩 계속 키우면서
            // 숫자에 "666"이 포함되어 있는지 검사
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        
        System.out.println(num);
    }
}