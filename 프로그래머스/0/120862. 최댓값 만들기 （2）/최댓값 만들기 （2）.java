import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0; 
        /*
        1. 정렬하기
        2. 양끝에 두개 곱하기
        3. 두개 비교해서 큰거 반환하기
        */
        Arrays.sort(numbers);
        int a = numbers[0] * numbers[1];
        int b = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if(a > b){
            answer = a;
        }else{
            answer = b;
        }
        
        return answer;
    }
}