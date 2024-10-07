class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int multiply = 2 * a * b; 
        String add = String.valueOf(a) + String.valueOf(b);
        
        int sum = Integer.parseInt(add);
        
        answer = sum > multiply ? sum : multiply;
        
        return answer;
    }
}