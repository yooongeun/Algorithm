import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();
        int picknum = nums.length / 2; 
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        if(set.size() <= picknum){
            answer = set.size();
        }else{
            answer = picknum;
        }
        
        return answer;
    }
}