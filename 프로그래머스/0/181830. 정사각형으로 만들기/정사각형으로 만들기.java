class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        if(arr.length > arr[0].length){ //행의 수가 더 많을 때
            answer = new int[arr.length][arr.length];
            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<arr[0].length; j++){
                    answer[i][j] = arr[i][j]; // 기존 데이터 복사
                }
            }
        }else if(arr.length < arr[0].length){ //열의 수가 더 많을 때
            answer = new int[arr[0].length][arr[0].length];
            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<arr[0].length; j++){
                    answer[i][j] = arr[i][j]; // 기존 데이터 복사
                }
            }
        }else {
            // 이미 정사각형인 경우
            answer = arr;
        }
        
        return answer;
    }
}