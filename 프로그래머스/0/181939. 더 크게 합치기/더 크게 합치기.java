class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String addone = String.valueOf(a) + String.valueOf(b);
        int Addone = Integer.parseInt(addone);
        
        String addtwo = String.valueOf(b) + String.valueOf(a);
        int Addtwo = Integer.parseInt(addtwo);
        
        if(Addone > Addtwo){
            answer = Addone;
        }else if(Addone < Addtwo){
            answer = Addtwo;
        }else if(Addone == Addtwo){
            answer = Addone;
        }
        return answer;
    }
}