import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String dateStr = "2016-" + a + "-" + b;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = dayOfWeek.toString().substring(0, 3);
        return answer;
    }
}