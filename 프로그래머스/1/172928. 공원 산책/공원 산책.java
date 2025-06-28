import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        // 🟢 1. 시작 위치 찾기
        for (int i = 0; i < park.length; i++) { // 행
            for (int j = 0; j < park[i].length(); j++) { // 열
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i; // 세로(y)
                    answer[1] = j; // 가로(x)
                    break;
                }
            }
        }

        // 🟢 2. 방향 이동 정의 (상, 하, 좌, 우)
        Map<String, int[]> directions = new HashMap<>();
        directions.put("N", new int[]{-1, 0}); // 북쪽
        directions.put("S", new int[]{1, 0});  // 남쪽
        directions.put("W", new int[]{0, -1}); // 서쪽
        directions.put("E", new int[]{0, 1});  // 동쪽

        int h = park.length;        // 공원의 세로 길이
        int w = park[0].length();   // 공원의 가로 길이

        // 🟢 3. 명령 수행
        for (String route : routes) {
            String[] tmp = route.split(" ");
            String op = tmp[0]; // 방향
            int n = Integer.parseInt(tmp[1]); // 거리

            int dx = directions.get(op)[1]; // 이동할 x 변화량
            int dy = directions.get(op)[0]; // 이동할 y 변화량

            int newY = answer[0]; // 현재 y 좌표
            int newX = answer[1]; // 현재 x 좌표

            boolean canMove = true;

            // 🟢 4. 이동할 모든 칸을 확인 (한 칸씩 확인)
            for (int i = 0; i < n; i++) {
                newY += dy;
                newX += dx;

                // (1) 경계를 벗어나는지 확인
                if (newY < 0 || newY >= h || newX < 0 || newX >= w) {
                    canMove = false;
                    break;
                }

                // (2) 장애물(`X`)이 있는지 확인
                if (park[newY].charAt(newX) == 'X') {
                    canMove = false;
                    break;
                }
            }

            // 🟢 5. 이동 가능하면 위치 업데이트
            if (canMove) {
                answer[0] = newY;
                answer[1] = newX;
            }
        }

        return answer;
    }
}
