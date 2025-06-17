class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp = 0;
        int w = 0;
        int h = 0;
        for (int i=0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
                tmp = 0;
            }
            // System.out.print("[" + sizes[i][0] + ", " + sizes[i][1] + "]");
            if (sizes[i][0] > w) w = sizes[i][0];
            if (sizes[i][1] > h) h = sizes[i][1];
        }
    

        return answer = w*h;
    }
}