class Solution {
    public String solution(String my_string, int[] indices) {
        // 문자열을 한 글자씩 String 배열로 분할
        String[] arr = my_string.split("");
        
        // 지워야 할 인덱스를 빈 문자열("")로 변경
        for (int i : indices) {
            arr[i] = "";
        }
        
        // 빈 문자열들을 그대로 이어 붙여서 반환
        return String.join("", arr);
    }
}