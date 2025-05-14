class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if(arr.length%2==0){
            for(int i = 1; i<arr.length; i+=2){
                arr[i]+=n;
            }
        }else if(arr.length%2!=0){
            for(int j = 0; j<arr.length; j+=2){
                arr[j]+=n;
            }
        }
        
        for(int k = 0; k<arr.length; k++){
            answer[k]=arr[k];
        }
        return answer;
    }
}