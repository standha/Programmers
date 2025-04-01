class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int first_sum = 0;      //짝수번째 원소들의 합
        int second_sum = 0;     //홀수번째 원소들의 합

        for(int i=0; i<num_list.length;i++){
            if(i%2==0){
                first_sum += num_list[i];
            }
            else{
                second_sum += num_list[i];
            }
            
        }
        
        answer = first_sum>second_sum ? first_sum:second_sum;

        return answer;
    }
}