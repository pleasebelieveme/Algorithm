class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int convertCount = 0;

        while (!s.equals("1")) {
            // 0 제거
            int beforeLength = s.length();
            s = s.replace("0", "");
            int afterLength = s.length();

            zeroCount += (beforeLength - afterLength);
            convertCount++;

            // 이진 변환
            s = Integer.toBinaryString(afterLength);
        }

        return new int[]{convertCount, zeroCount};
    }
}
