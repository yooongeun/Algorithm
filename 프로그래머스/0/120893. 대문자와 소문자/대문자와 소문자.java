
class Solution {
    public String solution(String my_string) {
        String answer = "";
        /*
        1. for문을 돌면서 한글자씩 확인한다
        2. 대문자면 소문자로 바꾸고 엔서에 +
        3. 소문자면 대문자로 바꾸고 엔서에 +
        */
        for(int i = 0; i < my_string.length(); i++){
            char cha = my_string.charAt(i);
            if(Character.isLowerCase(cha)){
                answer += Character.toUpperCase(cha);
            }else{
                answer += Character.toLowerCase(cha);
            }
        }
        return answer;
    }
}