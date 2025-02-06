import java.util.ArrayList;
import java.util.Collections;

class Solution {
   public int solution(String before, String after) {
        ArrayList<Character> arrBefore = new ArrayList<>();
        ArrayList<Character> arrAfter = new ArrayList<>();

        for (int i = 0; i < before.length(); i++) {
            arrBefore.add(before.charAt(i));
        }
        for (int j = 0; j < after.length(); j++) {
            arrAfter.add(after.charAt(j));
        }

        Collections.sort(arrBefore);
        Collections.sort(arrAfter);

        if (arrBefore.equals(arrAfter)) {
            return 1;
        } else {
            return 0;
        }
    }
}