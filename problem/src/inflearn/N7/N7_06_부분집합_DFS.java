package inflearn.N7;

public class N7_06_부분집합_DFS {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L==n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i]==1) tmp += (i + " ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}
		else {
			// 1은 사용
			ch[L] = 1;
			DFS(L+1);
			// 0은 사용하지 않음
			ch[L] = 0;
			DFS(L+1);
		}
	}
	public static void main(String[] args) {
		N7_06_부분집합_DFS T = new N7_06_부분집합_DFS();
		n = 3;
		ch = new int[n+1];
		T.DFS(1);
	}
}
