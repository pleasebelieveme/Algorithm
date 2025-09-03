import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public long solution(long n) {
		long answer = 0;
		List<Character> arr = new ArrayList<>();
		String str1 = String.valueOf(n);
        String str2 = "";
		for (char c : str1.toCharArray()) {
			arr.add(c);
		}
		arr.sort((a, b) -> b - a);
		for(char c : arr) {
			str2 += String.valueOf(c);
		}
		answer = Long.parseLong(str2);
        return answer;
    }
}