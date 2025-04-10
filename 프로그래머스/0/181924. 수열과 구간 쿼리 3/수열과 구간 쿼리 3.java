import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] result = new int[2];
        int temp = 0;
        for(int i = 0; i<queries.length;i++){
            result[0] = queries[i][0];
            result[1] = queries[i][1];
            temp = arr[result[0]]; 
            arr[result[0]] = arr[result[1]]; 
            arr[result[1]] = temp;
            answer = arr;
        }
        
        for(int i = 0; i<arr.length; i++){
            answer[i]=arr[i];
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}