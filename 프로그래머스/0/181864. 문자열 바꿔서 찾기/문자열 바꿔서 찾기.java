class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String replacement = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');  
        
        if(replacement.contains(pat)){
            answer = 1; 
        }
        
        
        return answer;
    }
}