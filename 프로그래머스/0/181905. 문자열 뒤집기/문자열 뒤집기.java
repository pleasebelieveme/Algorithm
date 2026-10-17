class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        // s부터 e까지 문자열 자르기
        String tmp = my_string.substring(s, e+1);
        String tmp2 = "";

        // 문자열을 문자 배열로 변환
        char[] tmpArr = tmp.toCharArray();

        // 뒤에서부터 하나씩 가져오기
        for (int i = tmp.length()-1; i>=0; i--) {
            tmp2 += tmpArr[i];
        }

        // 앞부분 + 뒤집은 부분 + 뒷부분
        answer = my_string.substring(0, s)+tmp2+my_string.substring(e + 1);

        return answer;
    }
}