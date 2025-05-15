import java.util.*;
class Solution {
    public List solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num: arr){
            answer.add(num);
        }
        for(int delet : delete_list){
            int result = answer.indexOf(delet);
            if(result != -1){
                answer.remove(result);
            }
        }
        
        return answer;
    }
}