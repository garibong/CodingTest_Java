import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++) {
            int count = 0;
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                arr.add(s.charAt(i));
            }
        }
        Collections.sort(arr);

        StringBuilder answer = new StringBuilder();
        for(char a : arr) {
            answer.append(a);
        }
        return answer.toString();
    }
}