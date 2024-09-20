import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        for(char a : arr){
            int cnt = 0; 
            for(char b : arr){
                if(a == b){
                    cnt++;
                }
            }
            if(cnt == 1){
                answer+=a;
            }
        }
        return answer;
    }
}