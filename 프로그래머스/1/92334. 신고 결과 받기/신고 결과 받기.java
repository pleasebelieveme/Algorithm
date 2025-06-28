import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;
        int[] answer = new int[n];
        
        // ID별 인덱스 저장 (결과 배열과 매칭을 쉽게 하기 위해)
        Map<String, Integer> idIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idIndexMap.put(id_list[i], i);
        }
        
        // 신고 내역 저장 (중복 방지)
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
        }
        
        // 신고당한 횟수 저장
        Map<String, Integer> reportCount = new HashMap<>();
        
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];  // 신고한 사람
            String reported = parts[1];  // 신고당한 사람
            
            // 신고 내역에 추가 (중복 신고 방지)
            if (!reportMap.get(reporter).contains(reported)) {
                reportMap.get(reporter).add(reported);
                reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
            }
        }
        
        // 정지된 유저 찾기
        Set<String> bannedUsers = new HashSet<>();
        for (String user : reportCount.keySet()) {
            if (reportCount.get(user) >= k) {
                bannedUsers.add(user);
            }
        }
        
        // 메일 받을 횟수 계산
        for (String reporter : reportMap.keySet()) {
            for (String reported : reportMap.get(reporter)) {
                if (bannedUsers.contains(reported)) {
                    answer[idIndexMap.get(reporter)]++;
                }
            }
        }
        
        return answer;
    }
}
