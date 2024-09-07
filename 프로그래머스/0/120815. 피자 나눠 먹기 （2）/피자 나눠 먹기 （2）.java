class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1; 
        
        if(n % 6 == 0){
            answer = n / 6;
        }else{
            while((n * pizza) % 6 != 0){
                pizza++;
            }
            answer = (n * pizza) / 6;
        }
        
        return answer;
    }
}