import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 주차 요금 관련 변수
        int baseTime = fees[0];   // 기본 시간(분)
        int baseFee = fees[1];    // 기본 요금(원)
        int unitTime = fees[2];   // 단위 시간(분)
        int unitFee = fees[3];    // 단위 요금(원)

        // 누적 주차 시간 저장: 차량 번호 -> 총 주차 시간(분)
        Map<String, Integer> totalTimeMap = new HashMap<>();

        // 입차 정보 저장: 차량 번호 -> 입차 시각("HH:MM")
        Map<String, String> inTimeMap = new HashMap<>();

        // 입/출차 기록 순회
        for (String record : records) {
            String[] parts = record.split(" ");
            String time = parts[0];   // 시각
            String car = parts[1];    // 차량 번호
            String action = parts[2]; // IN 또는 OUT

            if (action.equals("IN")) {
                // 입차일 경우 입차 시각 저장
                inTimeMap.put(car, time);
            } else {
                // 출차일 경우, 입차 시각 가져와서 주차 시간 계산
                int inMinutes = toMinutes(inTimeMap.remove(car)); // 입차 시간(분)
                int outMinutes = toMinutes(time);                 // 출차 시간(분)
                int duration = outMinutes - inMinutes;            // 주차 시간

                // 누적 주차 시간 갱신
                totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
            }
        }

        // 출차 기록이 없는 차량은 23:59에 출차된 것으로 간주
        for (String car : inTimeMap.keySet()) {
            int inMinutes = toMinutes(inTimeMap.get(car));
            int outMinutes = toMinutes("23:59"); // 마지막 시간
            int duration = outMinutes - inMinutes;

            // 누적 주차 시간에 더해줌
            totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
        }

        // 차량 번호 오름차순 정렬
        List<String> cars = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(cars);

        // 결과 배열 생성
        int[] answer = new int[cars.size()];

        // 각 차량의 요금 계산
        for (int i = 0; i < cars.size(); i++) {
            int time = totalTimeMap.get(cars.get(i)); // 누적 주차 시간
            int fee = baseFee; // 기본 요금

            // 기본 시간을 초과한 경우 추가 요금 계산
            if (time > baseTime) {
                int extraTime = time - baseTime;
                // 단위 시간으로 나눈 값을 올림하여 단위 요금 곱함
                fee += Math.ceil((double) extraTime / unitTime) * unitFee;
            }

            // 결과 저장
            answer[i] = fee;
        }

        return answer;
    }

    // "HH:MM" 형식의 시각을 분 단위로 변환하는 유틸리티 메서드
    private int toMinutes(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);
        return hour * 60 + minute;
    }
}
