class Solution {
    public String solution(String cipher, int code) {
        /*
        1. 싸이퍼 문자열을 배열로 바꾼다 
        2. 정답 넣을 배열 만든다 
        3. 포문 돌면서 코드 숫자 배수번째에 해당할때만 정답 배열에 집어넣는다
        */
        String answer = "";
        
        char[] chararray = cipher.toCharArray();
        for(int i = 0; i < chararray.length; i++){
            if((i + 1) % code == 0){
                answer += chararray[i];
            }
        }

        return answer;
    }
}