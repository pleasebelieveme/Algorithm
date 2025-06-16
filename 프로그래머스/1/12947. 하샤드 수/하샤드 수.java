class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = String.valueOf(x);
        int hashadInt = 0;
        for (char c : str.toCharArray()) {
            hashadInt += c-48;
        }
        System.out.println(hashadInt);
        if(x%hashadInt==0) answer = true;
        return answer;
    }
}