class Solution {
    public int solution(int n) {
        int answer = 0;
        int max = Math.max(n, 6);
        int min = Math.min(n, 6);
        
        while(min != 0) {
            int a = max % min;
            max = min;
            min = a;
        }
        
        if(n % 6 == 0) {
            answer = n / 6;
        } else {
            answer = (( n * 6 ) / max ) / 6;
        }

        return answer;
    }
}