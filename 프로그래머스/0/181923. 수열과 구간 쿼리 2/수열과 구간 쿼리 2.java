import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        //answer배열을 0으로 초기화하기
        Arrays.fill(answer,0);

        for(int i=0; i<queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;
            
            for(int j=s;j<=e;j++){
                if(arr[j] < min && arr[j]>k){ //가장 큰수는 아니면서 k보다는 큰 수이면
                    min = arr[j];
                    
                }
            }
            //min값이 가장 큰 값이 아니면 answer[i]배열에 넣고 가장 큰 값이면 -1
            if (min != Integer.MAX_VALUE) {
                answer[i] = min;
            } else {
                answer[i] = -1;
            }
        }
        System.out.printf(Arrays.toString(answer));
        return answer;
    }
}