class Solution {
    public int[] solution(int n, int[] numlist) {
        int a = 0; 
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                a++;
            }
        }
        int[] answer = new int[a];
        
        int index = 0; 
        for(int j = 0; j < numlist.length; j++){
            if(numlist[j] % n == 0){
                answer[index] = numlist[j];
                index++;
            }
            
        }
        return answer;
    }
}