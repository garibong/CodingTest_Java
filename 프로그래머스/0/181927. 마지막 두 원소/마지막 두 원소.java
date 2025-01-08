import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> arr = new ArrayList<>();
        for(int a : num_list) {
            arr.add(a);
        }
        int len = num_list.length;
        int a = num_list[len -1];
        int b = num_list[len -2];
        int temp = 0;
        if(a > b) {
            temp = a - b;
            arr.add(temp);
        } else {
            temp = a * 2;
            arr.add(temp);
        }
        
        return arr;
    }
}