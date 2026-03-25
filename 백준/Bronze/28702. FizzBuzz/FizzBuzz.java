import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = {sc.next(), sc.next(), sc.next()};
        
        int nextVal = 0;

        // 3개의 입력을 검사하여 숫자를 찾고, 4번째 올 숫자를 계산
        for (int i = 0; i < 3; i++) {
            char firstChar = input[i].charAt(0);
            
            // 첫 글자가 숫자라면 (Fizz, Buzz, FizzBuzz는 모두 문자로 시작함)
            if (firstChar >= '0' && firstChar <= '9') {
                // i가 0이면 +3, 1이면 +2, 2이면 +1을 하면 다음 숫자가 나옴
                nextVal = Integer.parseInt(input[i]) + (3 - i);
                break;
            }
        }

        // 구한 숫자를 FizzBuzz 규칙에 따라 출력
        if (nextVal % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextVal % 3 == 0) {
            System.out.println("Fizz");
        } else if (nextVal % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextVal);
        }
        
        sc.close();
    }
}