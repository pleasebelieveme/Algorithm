/*
// 이중 for문+배열 => 시간초과
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
            for (String s : callings) {
                for(int i=0; i<players.length; i++) {
                    if(players[i].equals(s)) {
                        String tmp = players[i-1];
                        players[i-1] = players[i];
                        players[i] = tmp;
                    }
                }
            }
        return players;
    }
}
*/

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수의 이름을 key로, 현재 등수를 value로 저장하는 HashMap
        Map<String, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);  // 선수 이름 -> 현재 등수
        }

        // callings 배열을 순회하면서 선수 순위 변경
        for (String s : callings) {
            int curIdx = rankMap.get(s); // 불린 선수의 현재 등수
            int prevIdx = curIdx - 1;    // 한 칸 앞 선수의 등수

            // 선수들 swap
            String tmp = players[prevIdx];
            players[prevIdx] = players[curIdx];
            players[curIdx] = tmp;

            // rankMap 업데이트
            rankMap.put(players[prevIdx], prevIdx);
            rankMap.put(players[curIdx], curIdx);
        }

        return players;
    }
}
