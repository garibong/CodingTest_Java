import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : my_string.toCharArray()) {
            charSet.add(c);
        }
        for(char a : charSet) {
            answer += a;
        }
        return answer;
    }
}