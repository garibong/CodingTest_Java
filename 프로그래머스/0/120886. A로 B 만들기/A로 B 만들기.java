import java.util.Arrays;

class Solution {
   public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
       
        if(strA.equals(strB)) {
            return 1;
        } else {
            return 0;
        }
    }
}