class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i][j]==arr[j][i]){
                    answer += 1; //arr[i][j]==arr[j][i]이면 answer +1
                }
            }
        }
        //answer에 담긴 값이 arr의 원소 개수와 같을 때
        if(answer == (arr.length*arr.length)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}