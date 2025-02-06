class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String com = Integer.toString(k);
        for (int cnt = i; cnt <= j; cnt++) {
            String cntStr = Integer.toString(cnt);
            for (int l = 0; l < cntStr.length(); l++) {
                if (cntStr.charAt(l) == com.charAt(0)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}