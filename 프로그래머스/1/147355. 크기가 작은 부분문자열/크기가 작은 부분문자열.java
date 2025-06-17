class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        
        for (int i = 0; i <= t.length() - pLength; i++) {
            // 슬라이딩 윈도우 방식으로 t에서 p와 같은 길이의 부분 문자열을 잘라냄
            String tmp = t.substring(i, i + pLength);
            
            // tmp를 숫자로 변환하고 p와 비교
            if (Long.parseLong(tmp) <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}