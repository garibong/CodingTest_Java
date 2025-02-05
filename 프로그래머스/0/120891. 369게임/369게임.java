class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] arr = String.valueOf(order).toCharArray();
        for(char a : arr) {
            if(a == '3' || a == '6' || a == '9') {
                answer++;
            }
        }
        return answer;
    }
}