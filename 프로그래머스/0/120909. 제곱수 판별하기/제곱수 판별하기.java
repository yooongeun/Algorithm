class Solution {
    public int solution(int n) {
        int answer = 0;
        double value = Math.sqrt(n);
        
        if(n % value == 0){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}