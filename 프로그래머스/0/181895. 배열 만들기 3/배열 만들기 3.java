import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        //int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        for(int i = a1; i<b1+1; i++){
            list.add(arr[i]);
        }
        for(int j = a2; j<b2+1; j++){
            list.add(arr[j]);
        }
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}