class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = idx; i<arr.length; i++){
            if(arr[i]==1){ 
                answer = i;
                break;  // arr[i]==1가 맞다면 1로 바꾸고 for문 빠져나와야함
            }else{
                answer = -1;
            }
        }  
        return answer;
    }
}