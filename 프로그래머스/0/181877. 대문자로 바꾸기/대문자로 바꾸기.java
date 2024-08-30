class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(Character.isLowerCase(arr[i])){
                answer += Character.toUpperCase(arr[i]);
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
}