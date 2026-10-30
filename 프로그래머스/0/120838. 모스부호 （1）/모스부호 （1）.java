import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {

        // 모스부호 → 알파벳
        Map<String, String> morse = new HashMap<>();

        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        StringBuilder answer = new StringBuilder();

        // 공백을 기준으로 모스부호 분리
        String[] letters = letter.split(" ");

        // 하나씩 알파벳으로 변환
        for (String code : letters) {
            answer.append(morse.get(code));
        }

        return answer.toString();
    }
}