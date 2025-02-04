class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        int a = 0;
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i != j) {
                  a = numbers[i] * numbers[j];
                    if(a > answer) {
                        answer = a;
                    }
                }
            }
        }
        return answer;
    }
}