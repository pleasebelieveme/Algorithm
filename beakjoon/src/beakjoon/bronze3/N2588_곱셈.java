package beakjoon.bronze3;

import java.util.ArrayList;
import java.util.Scanner;

/*
472
385
 */
public class N2588_곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tmp = b;
		ArrayList<Integer> arr = new ArrayList<>();
		int namegy = 0;
		while (b!=0){
			namegy = b%10;
			arr.add(namegy);
			b = b/10;
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(a*arr.get(i));
		}
		System.out.println(a*tmp);
	}
}
