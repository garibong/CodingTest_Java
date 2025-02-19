import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int num =Math.abs(n - array[0]);
        int answer = array[0];
        for(int i=1; i<array.length; i++) {
            if(num > Math.abs(n - array[i])) {
                num = Math.abs(n - array[i]);
                answer = array[i];
            }
        }
        return answer;
    }
}