import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] arr = my_string.toCharArray();
        
        Arrays.sort(arr); // 알파벳도 정렬된다 굿! 
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}


