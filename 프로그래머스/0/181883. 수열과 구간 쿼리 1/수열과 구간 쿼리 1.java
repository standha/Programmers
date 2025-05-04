class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];
        for(int i = 0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            for(int j = a; j<=b; j++){
                arr[j] += 1;  
            }    
        }   
        for(int k = 0; k<answer.length; k++){
            answer[k] = arr[k];
        }
            return answer;
    }
}