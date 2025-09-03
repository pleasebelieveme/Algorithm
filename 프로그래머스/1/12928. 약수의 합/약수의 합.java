import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
		List<Integer> nArr = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				nArr.add(i);
			}
		}
		for(int i : nArr) answer += i;
        return answer;
    }
}