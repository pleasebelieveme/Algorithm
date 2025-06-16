import java.util.*;
import java.time.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];   // 기본 시간
        int baseFee = fees[1];    // 기본 요금
        int unitTime = fees[2];   // 단위 시간
        int unitFee = fees[3];    // 단위 요금

        Map<String, Integer> totalTimeMap = new HashMap<>(); // 차량번호 -> 누적 주차 시간
        Map<String, String> inTimeMap = new HashMap<>();     // 입차 정보 저장

        for (String record : records) {
            String[] parts = record.split(" ");
            String time = parts[0];
            String car = parts[1];
            String action = parts[2];

            if (action.equals("IN")) {
                inTimeMap.put(car, time);
            } else {
                int inMinutes = toMinutes(inTimeMap.remove(car));
                int outMinutes = toMinutes(time);
                int duration = outMinutes - inMinutes;
                totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
            }
        }

        // 출차 기록 없는 차량 처리
        for (String car : inTimeMap.keySet()) {
            int inMinutes = toMinutes(inTimeMap.get(car));
            int outMinutes = toMinutes("23:59");
            int duration = outMinutes - inMinutes;
            totalTimeMap.put(car, totalTimeMap.getOrDefault(car, 0) + duration);
        }

        // 차량 번호 기준 정렬
        List<String> cars = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(cars);

        // 요금 계산
        int[] answer = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            int time = totalTimeMap.get(cars.get(i));
            int fee = baseFee;

            if (time > baseTime) {
                int extraTime = time - baseTime;
                fee += Math.ceil((double) extraTime / unitTime) * unitFee;
            }

            answer[i] = fee;
        }

        return answer;
    }

    private int toMinutes(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);
        return hour * 60 + minute;
    }
}
