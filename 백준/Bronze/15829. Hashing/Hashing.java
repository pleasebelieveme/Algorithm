import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        final long M = 1234567891L;
        final long R = 31L;

        long hash = 0;
        long power = 1;  // 31^0부터 시작

        for (int i = 0; i < L; i++) {
            int value = str.charAt(i) - 'a' + 1;
            hash = (hash + value * power) % M;
            power = (power * R) % M;
        }

        System.out.println(hash);
    }
}
