class Solution {
    public int[] solution(int start_num, int end_num) {
        //int 배열 크기 할당
        int[] answer = new int[(end_num - start_num) +1];
            
        int j = 0;
        for(int i = start_num; i <= end_num; i++){
            
           answer[j] = i;
            j++;

        }
        
        return answer;
    }
}