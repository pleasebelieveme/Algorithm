//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        String tmp = String.valueOf(n);
//        char[] charArr = tmp.toCharArray();
//        for (char c : charArr) {
//            answer += c - '0';
//        }
//        return answer;
//    }
//}

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;  // 마지막 자리 더하기
            n /= 10;           // 마지막 자리 제거
        }
        return answer;
    }
}