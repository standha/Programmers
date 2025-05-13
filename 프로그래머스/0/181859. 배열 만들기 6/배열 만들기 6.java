import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
       
        for(int i = 0; i<arr.length; i++){
            if(list.size() == 0){
                list.add(arr[i]);
                //break;
            }else if(list.get(list.size()-1)==arr[i]){ //list배열 마지막 값이 arr[i]와 같으면
                list.remove(list.size()-1);
                //break;
            }else if(list.get(list.size()-1)!=arr[i]){ //list배열 마지막 값이 arr[i]와 다르면
                list.add(arr[i]);
                //break;
            }
        }
        if(list.size()==0){ //빈배열이면
            list.add(-1);
        }
         int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}