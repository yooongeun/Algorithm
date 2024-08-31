import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        int[] array=new int[100];
        
        int count=0;
        
        for(int i=0;i<my_string.length();i++){
            if('0'<=my_string.charAt(i)&& my_string.charAt(i)<='9'){
                array[count]=my_string.charAt(i)-'0';
                count++;
            }
        }
        
        int[] answer =new int[count];
        
        for(int i=0;i<count;i++){
            answer[i]=array[i];
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}