class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        
        answer = (double)sum / numbers.length;
        return answer;
    }
}