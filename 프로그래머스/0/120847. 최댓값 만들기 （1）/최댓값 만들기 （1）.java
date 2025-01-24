import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        Arrays.sort(numbers);
        answer = numbers[len -2] * numbers[len -1];
        return answer;
    }
}