import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 300만 건의 연산 속도를 감당하기 위해 버퍼를 사용합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int M = Integer.parseInt(br.readLine());
        
        /*
         * 집합 S를 int형 변수 하나로 관리합니다.
         * 자바의 int는 32비트이므로, 1~20번 비트를 각각의 숫자 존재 여부(Flag)로 사용합니다.
         * 0이면 없음, 1이면 있음. (메모리 사용량: 단 4바이트)
         */
        int S = 0; 

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            // all과 empty는 뒤에 숫자가 붙지 않으므로 분기 처리
            if (command.equals("all")) {
                // 1을 21번 왼쪽으로 밀면 22번째 비트만 1이 됨 (100...000)
                // 거기서 1을 빼면 1~20번째 비트가 모두 1로 채워짐 (011...111)
                S = (1 << 21) - 1;
                continue;
            } else if (command.equals("empty")) {
                S = 0; // 모든 비트를 0으로 초기화 (공집합)
                continue;
            }

            int x = Integer.parseInt(st.nextToken());

            switch (command) {
                case "add":
                    /*
                     * [OR 연산] S = S | (1 << x)
                     * 1을 x만큼 밀어서 x번째 자리만 1인 마스크를 만듭니다.
                     * 기존 S와 OR 연산을 하면, x번째 자리는 무조건 1이 되고 나머지는 유지됩니다.
                     */
                    S |= (1 << x);
                    break;

                case "remove":
                    /*
                     * [AND NOT 연산] S = S & ~(1 << x)
                     * ~(1 << x)는 x번째만 0이고 나머지는 모두 1인 마스크입니다.
                     * AND 연산을 하면 x번째만 0으로 지워지고 나머지는 자기 모습을 유지합니다.
                     */
                    S &= ~(1 << x);
                    break;

                case "check":
                    /*
                     * [AND 연산 확인]
                     * S와 (1 << x)를 AND 연산했을 때 0이 아니라면, x번째 비트가 1이라는 뜻입니다.
                     */
                    sb.append((S & (1 << x)) != 0 ? "1\n" : "0\n");
                    break;

                case "toggle":
                    /*
                     * [XOR 연산] S = S ^ (1 << x)
                     * XOR은 두 비트가 다를 때만 1을 반환합니다.
                     * x번째가 0이었으면 1로(0^1=1), 1이었으면 0으로(1^1=0) 반전시킵니다.
                     */
                    S ^= (1 << x);
                    break;
            }
        }
        // 최종 결과 출력
        System.out.print(sb);
    }
}