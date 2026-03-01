import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(); // 하루에 올라갈 수 있는 높이
        long B = sc.nextLong(); // 잘때 내려가는 높이
        long V = sc.nextLong(); // 목표 높이

        long days = (V - B - 1) / (A - B) + 1;

        System.out.println(days);
    }
}