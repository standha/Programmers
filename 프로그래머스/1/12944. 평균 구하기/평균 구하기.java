class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int result = 0;
        
        for(int i = 0; i<arr.length; i++){
            result += arr[i];
        }
        
        answer = (double)result/(double)arr.length;
        return answer;
    }
}