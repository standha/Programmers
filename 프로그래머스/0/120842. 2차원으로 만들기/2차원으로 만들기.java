class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int k = 0;
        for(int i = 0; i<num_list.length/n; i++){  //행만큼만 반복
            for(int j = 0; j<n; j++){  //n만큼만 반복해서 answer의 열에 값 넣가
                answer[i][j] = num_list[k];
                k++;
            }
            
        }
        
        return answer;
    }
}