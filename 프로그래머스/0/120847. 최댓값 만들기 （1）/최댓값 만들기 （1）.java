class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0; 
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                max = numbers[i] * numbers[j];
                if (max > answer && max != 0){
                answer = max;
            }
            } 
        }
        return answer;
    }
}