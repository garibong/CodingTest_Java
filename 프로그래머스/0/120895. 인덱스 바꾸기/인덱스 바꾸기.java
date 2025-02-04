class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        String[] arr = my_string.split("");
        arr[num1] = String.valueOf(b);
        arr[num2] = String.valueOf(a);
        for(String c : arr) {
            answer += c;
        }
        
        return answer;
    }
}