import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]+");

        List<String> result = new ArrayList<>();

        for (String str : answer) {
            if (!str.isEmpty()) {
                result.add(str);
            }
        }

        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return result.toArray(new String[0]);
    }
}