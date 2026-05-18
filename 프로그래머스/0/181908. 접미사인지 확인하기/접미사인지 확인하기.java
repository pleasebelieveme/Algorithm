class Solution {
    public int solution(String my_string, String is_suffix) {
        if (is_suffix.length() > my_string.length()) {
            return 0;
        }
        String answer = my_string.substring(my_string.length()-is_suffix.length());
        return answer.equals(is_suffix) ? 1 : 0;
    }
}