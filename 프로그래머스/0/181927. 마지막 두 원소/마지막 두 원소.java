import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length+1];
        
        for(int i = 0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        
       if(num_list[num_list.length-2]<num_list[num_list.length-1]){
            answer[num_list.length] = 
                        num_list[num_list.length-1]-num_list[num_list.length-2];
        }else if(num_list[num_list.length-2]>=num_list[num_list.length-1]){
            answer[num_list.length] = 
                        num_list[num_list.length-1] + num_list[num_list.length-1];
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

}