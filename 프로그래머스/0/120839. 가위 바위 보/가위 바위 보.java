class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder(); // StringBuilder를 사용하여 문자열을 효율적으로 생성
        char[] arr = rsp.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '2'){ // 가위
                answer.append('0'); // 바위
            } else if(arr[i] == '0'){ // 바위
                answer.append('5'); // 보
            } else if(arr[i] == '5'){ // 보
                answer.append('2'); // 가위
            }
        }
        return answer.toString(); // StringBuilder를 문자열로 변환하여 반환
    }
}
