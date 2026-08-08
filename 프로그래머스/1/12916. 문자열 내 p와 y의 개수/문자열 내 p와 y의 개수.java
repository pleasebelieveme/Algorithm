class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        for(char c : s.toUpperCase().toCharArray()) {
            if(c=='P') pCount++;
            if(c=='Y') yCount++;
        }
        if(pCount+yCount==0 || pCount==yCount) {
            answer = true;
        }
        
        return answer;
    }
}