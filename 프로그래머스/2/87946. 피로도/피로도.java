class Solution {
    int answer = 0;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    public void dfs(int k, int[][] dungeons, int depth) {
        answer = Math.max(answer, depth);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, depth + 1);
                visited[i] = false;
            }
        }
    }
}