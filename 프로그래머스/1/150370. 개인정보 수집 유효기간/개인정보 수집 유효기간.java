import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 파기해야할 개인정보 출력
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        // 오늘날짜 포멧팅
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);
        
        // 유효기간 포멧팅
        Map<String, Integer> map = new HashMap<>();
        for (String t : terms) {
            String[] term = t.split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }
        
        // 검증비교 포멧팅 및 파기 날짜 계산
        for (int i = 0; i < privacies.length; i++) {
            String[] privaciesParts = privacies[i].split(" ");
            String privacyDateStr = privaciesParts[0];  // 개인정보 수집일
            String termType = privaciesParts[1];  // 약관 종류
            
            // 개인정보 수집 날짜를 LocalDate로 변환
            LocalDate privacyDate = LocalDate.parse(privacyDateStr, formatter);
            
            // 유효기간 구하기 (28일씩 더하는게 아니라 개월단위이기 때문에 상관없음)
            int monthsToAdd = map.get(termType);  // 약관 종류에 해당하는 유효기간(개월)
            LocalDate expirationDate = privacyDate.plusMonths(monthsToAdd); // 만료일 계산

            // 만약 만료일이 오늘 날짜 이전 또는 오늘 날짜인 경우 파기해야 하는 개인정보
            if (!expirationDate.isAfter(todayDate)) {
                answer.add(i + 1);  // 개인정보 번호는 1부터 시작하므로 i+1
            }
        }
        
        // 결과를 배열로 변환하여 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
