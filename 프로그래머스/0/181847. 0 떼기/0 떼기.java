class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] arr = n_str.toCharArray(); 
        
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '0'){
                continue;
            }else{
                for(int j = i; j < arr.length; j++){
                    answer += arr[j];
                }
                break;
            }
        }
        return answer;
    }
}