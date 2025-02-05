class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String[] arr = Integer.toString(num).split("");
        String s = Integer.toString(k);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}