import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int count = 0;
        String str = String.valueOf(num);
        char word = Character.forDigit(k, 10); 
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == word && count == 0){
                answer = i + 1; 
                count++;
            }else if(answer == 0){
                answer = -1; 
            }
        }
        return answer;
    }
}