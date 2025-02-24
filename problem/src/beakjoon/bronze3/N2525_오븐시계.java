package beakjoon.bronze3;

import java.util.Scanner;

public class N2525_오븐시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int d = (b+c)/60;
		if (b+c >= 60) a += d;
		if (a >= 24) a -= 24;
		b = (b+c) - d*60;
		System.out.println(a+ " " + b);
	}
}
