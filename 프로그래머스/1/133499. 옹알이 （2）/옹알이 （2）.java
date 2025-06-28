class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String prev = ""; 
            String tmp = word; 

            while (tmp.length() > 0) {
                boolean matched = false;
                for (String speak : canSpeak) {
                    if (tmp.startsWith(speak) && !speak.equals(prev)) {
                        prev = speak;
                        tmp = tmp.substring(speak.length());
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    break;
                }
            }

            if (tmp.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
