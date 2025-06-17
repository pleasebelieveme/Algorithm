class Solution {
    public int solution(int n) {
        int answer = 0;
        String trit = Integer.toString(n,3);
        char[] cArr = trit.toCharArray();
        String reverseTrit = "";
        for (int i=trit.length(); i>0; i--) {
            reverseTrit += String.valueOf(cArr[i-1]);
        }
        System.out.println(reverseTrit);
        answer = Integer.parseInt(reverseTrit, 3);
        return answer;
    }
}