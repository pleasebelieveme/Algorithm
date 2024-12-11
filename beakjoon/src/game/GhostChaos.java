package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GhostChaos {
    public static void main(String[] args) {
        String[] objects = {"whiteGhost", "redChair", "blueBook", "greenBottle", "grayMouse"};
        String[] card = {"whiteBook", "greenMouse"};
        String answer = null;


        for (String o : objects) {
            if (o.equals(card[0]) || o.equals(card[1])) {
                answer = o;
                break;
            }
        }

        if (answer == null) {
            List<String> oddList = new ArrayList<>();
            List<String> odds = new ArrayList<>();
            for (String c : card) {
                String[] parts = c.split("(?=\\p{Upper})");
                odds.addAll(Arrays.asList(parts));
            }

            for (String o : objects) {
                boolean isOdd = false;
                for (String odd : odds) {
                    if (o.contains(odd)) {
                        isOdd = true;
                        break;
                    }
                }
                if (!isOdd) {
                    answer = o;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
