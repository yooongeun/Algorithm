class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int max = 1;
        int sum = 0; 
        
        for(int i = 0; i < num_list.length; i++){
            max *= num_list[i];
            sum += num_list[i];
        }
        
        if(max < sum * sum){
            answer = 1;
        }else{
            answer = 0; 
        }
        return answer;
    }
}