import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        //int[] answer={};
        for(int i =1; i<=n; i++){
          if(i%2!=0){
            arr.add(i);
          }
        }
        Collections.sort(arr);
        // ArrayList<Integer> → int[] 변환
        int[] result = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            result[i] = arr.get(i);
        }
            
        return result;
    }
}