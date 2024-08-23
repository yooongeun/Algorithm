class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = 0;
        
        if(n % 10 == 0 || n > 10){
            free = n / 10;
        } 
        answer = (n * 12000) + ((k - free) * 2000);
        
        
        return answer;
    }
}