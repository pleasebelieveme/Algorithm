import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] isbnArr = sc.next().toCharArray();
        
        int tmpSum = 0;
        int starIndex = 0;
        
        for (int i=0; i<13; i++) {
            if (isbnArr[i]=='*') {
                starIndex = i;
            } else {
                int num = isbnArr[i]-'0';
                if (i%2 == 0) {
                    tmpSum += num*1;
                } else {
                    tmpSum += num*3;
                }
            }
        }
        
        int starWeight = (starIndex%2 == 0) ? 1:3;
        
        for (int x=0; x<=9; x++) {
            // (기존 합 + 대입한 숫자 * 가중치)가 10의 배수인지 확인
            if ((tmpSum + (x * starWeight)) % 10 == 0) {
                System.out.println(x);
                break; // 정답을 찾으면 루프 종료
            }
        }
        
        sc.close();
    }
}