class Solution {
    public int solution(String my_string) {
        int answer = 0;
        /*
        1. 문자열을 배열로 바꾼다 
        2. 알파벳은 전부 없앤다.
        3. 남은 숫자끼리 포문 돌면서 더한다. 
        */
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(!Character.isDigit(arr[i])){
                arr[i] = 0;
            }else{
                answer += arr[i] - '0'; //해당 숫자의 아스키 값에서 0의 아스키 값 48을 빼는 것 
            }
        }
        
        return answer;
    }
}