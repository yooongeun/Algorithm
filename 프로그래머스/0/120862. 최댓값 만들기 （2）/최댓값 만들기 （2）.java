class Solution {
    public int solution(int[] numbers) {
        int answer = -999999999;
        int max = 0; 
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = numbers.length - 1; j > i; j--){
                max = numbers[i] * numbers[j];
                if(max > answer){
                    answer = max;
                }
            }
        }

        return answer;
    }
}