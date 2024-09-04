class Solution {
    public int solution(int order) {
        String list = Integer.toString(order);
        int count = 0; 
        
        for(int i = 0; i < list.length(); i++){
            char a = list.charAt(i);
            if(a == '3' || a == '6' || a == '9'){
                count++;
            }
        }
        
        return count;
    }
}