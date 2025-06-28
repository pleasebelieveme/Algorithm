import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        // survey에서 i값을 꺼내고 choices에서 i값을 꺼내어 점수를 저장
        // 저장한 점수를 바탕으로 높은 점수를 반환, 같으면 앞자리
        Map<Character, Integer> map = new HashMap<>();
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (char c : type) {
            map.put(c, 0);
        }
        // System.out.println(map);
        
        for(int i=0; i<survey.length; i++) {
            char c = ' ';
            if(choices[i] == 4) continue;
            else if (choices[i] > 0 && choices[i] < 4) {
                c = survey[i].charAt(0);
                // 1->3, 2->2, 3->1
                map.put(c, map.get(c) + 4-choices[i]);
            }
            else {
                c = survey[i].charAt(1);
                // 5->1, 6->2, 7->3
                map.put(c, map.get(c) + choices[i]-4);
            }
        }
        System.out.println(map);
        if(map.get('R') > map.get('T') || map.get('R') == map.get('T')) answer += "R";
        else answer += "T";
        
        if(map.get('C') > map.get('F') || map.get('C') == map.get('F')) answer += "C";
        else answer += "F";
        
        if(map.get('J') > map.get('M') || map.get('J') == map.get('M')) answer += "J";
        else answer += "M";
        
        if(map.get('A') > map.get('N') || map.get('A') == map.get('N')) answer += "A";
        else answer += "N";
        
        return answer;
    }
}