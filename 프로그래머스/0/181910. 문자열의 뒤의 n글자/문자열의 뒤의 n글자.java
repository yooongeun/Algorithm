class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        int start = arr.length - n; 
        
        for(int i = start; i < arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}