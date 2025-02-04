class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String b = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = b.split("");
        for(String a : arr) {
            answer += Integer.parseInt(a);
        }
        return answer;
    }
}