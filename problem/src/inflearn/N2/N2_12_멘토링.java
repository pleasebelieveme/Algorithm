package inflearn.N2;

import java.util.Scanner;

/*
4 3
3 4 1 2
4 3 2 1
3 1 4 2
 */
public class N2_12_멘토링 {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for (int i = 1; i <= n; i++) { // 학생 수
			for (int j = 1; j <= m; j++) { // 테스트 수
				int cnt = 0;
				for (int k = 0; k < m; k++) { // 테스트 수
					int pi = 0, pj = 0;
					for (int s = 0; s < n; s++) { // 학생 수
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		N2_12_멘토링 T = new N2_12_멘토링();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 학생 수
		int m = kb.nextInt(); // 테스트 수
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, m, arr));
	}
}



/*
3중 for문
import java.util.Scanner;

public class 멘토링 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] intArrArr = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp = scan.nextInt();
                intArrArr[temp-1][i] = j;
            }
        }
        System.out.println(solution(n,m,intArrArr));
    }

    private static int solution(int n, int m, int[][] intArrArr) {
        int answer = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean flag = true;
                for(int k=0;k<m;k++){
                    if(intArrArr[i][k] >= intArrArr[j][k]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }
}
 */