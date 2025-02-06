import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];        
        
        HashMap<Integer, Integer> arr = new HashMap<>(); // 3 - 0 , 76 - 1, 24 - 2
        for(int i=0; i<emergency.length; i++) {
            arr.put(emergency[i], i);    
        }
        
        int[] emergencyCopy = emergency.clone();
        Arrays.sort(emergencyCopy);  // 3, 24, 76

        int rank = 1;
        for(int j=emergencyCopy.length -1; j>=0; j--) {
            int key = emergencyCopy[j];
            int index = arr.get(key);
            answer[index] = rank++;
        }
        return answer;
    }
}