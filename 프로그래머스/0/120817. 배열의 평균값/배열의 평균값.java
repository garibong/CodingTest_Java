class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int len = numbers.length;
        for(int a : numbers) {
            sum += a;
        }
        answer = (double)sum / len;
        return answer;
    }
}