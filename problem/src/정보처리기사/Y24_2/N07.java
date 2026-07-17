package 정보처리기사.Y24_2;

interface Number {
	int sum(int[] a, boolean odd);
}

class OENumber implements Number {
	public int sum(int[] a, boolean odd) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if ((odd && a[i] % 2 != 0) || (!odd && a[i] % 2 == 0)) {
				result += a[i];
			}
		}
		return result;
	}
}

public class N07 {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		OENumber OE = new OENumber();
		System.out.print(OE.sum(a, true) + ", " + OE.sum(a, false));
	}
}