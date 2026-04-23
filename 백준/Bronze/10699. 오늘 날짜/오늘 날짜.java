import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // 서울(Asia/Seoul) 시간대를 기준으로 오늘 날짜를 가져옵니다.
        LocalDate seoulToday = LocalDate.now(ZoneId.of("Asia/Seoul"));
        
        // YYYY-MM-DD 형식으로 출력 (LocalDate의 기본 toString 형식입니다)
        System.out.println(seoulToday);
    }
}