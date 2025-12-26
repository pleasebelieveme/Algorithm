import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        // 번호 -> 이름
        String[] numToName = new String[N + 1];

        // 이름 -> 번호
        Map<String, Integer> pokemonBook = new HashMap<>();

        // 포켓몬 도감 입력
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            numToName[i] = name;
            pokemonBook.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        // 문제 처리
        for (int i = 0; i < M; i++) {
            String query = br.readLine();

            if (Character.isDigit(query.charAt(0))) {
                int idx = Integer.parseInt(query);
                sb.append(numToName[idx]).append('\n');
            } else {
                sb.append(pokemonBook.get(query)).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
