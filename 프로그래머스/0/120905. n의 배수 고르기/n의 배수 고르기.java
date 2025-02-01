import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int a : numlist) {
            if(a % n == 0) {
                arr.add(a);
            }
        }
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}