class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int index = 0;
        for(String a : strlist) {
            answer[index++] = a.length();
        }
        return answer;
    }
}