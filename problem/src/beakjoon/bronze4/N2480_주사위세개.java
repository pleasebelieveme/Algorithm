package beakjoon.bronze4;

import java.util.Scanner;

public class N2480_주사위세개 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		if (a==b && b==c) {
			result = 10000+(a*1000);
		} else if (a==b && a!=c) {
			result = 1000+(a*100);
		} else if (a==c && a!=b) {
			result = 1000+(a*100);
		} else if (b==c && b!=a) {
			result = 1000+(b*100);
		} else {
			int max = Math.max(a, Math.max(b,c));
			// int max = a;
			// if(a > b && a > c) max = a;
			// else if (b > a && b > c) max = b;
			// else max = c;
			result = max*100;
		}
		System.out.println(result);
	}
}
