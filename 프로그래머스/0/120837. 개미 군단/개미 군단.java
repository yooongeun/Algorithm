class Solution {
    public int solution(int hp) {
        int answer = 0;
 
        int big = hp / 5; 
        hp = hp - (big * 5);
        
        int middle = hp /3;
        hp = hp - (middle * 3);
        
        int small = hp; 
        
        answer = big + middle + small;
        
        
        return answer;
    }
}