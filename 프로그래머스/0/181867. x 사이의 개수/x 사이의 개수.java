import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        for (char c : myString.toCharArray()) {
            if (c != 'x') {
                count++;
            } else {
                answer.add(count);
                count = 0;
            }
        }
        answer.add(count);
        return answer;
    }
}