package inflearn.N7;

public class N07_04_피보나치수열 {
	static int[] fibo;
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n]=1;
		if(n==1 || n==2) return 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}
	public static void main(String[] args) {
		N07_04_피보나치수열 T = new N07_04_피보나치수열();
		int n = 10;
		fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}
