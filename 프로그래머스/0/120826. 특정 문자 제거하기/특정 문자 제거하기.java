class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        //char arr = my_string.toCharArray();
        my_string = my_string.replaceAll(letter, "");
        answer += my_string;
         
        return answer;
    }
}