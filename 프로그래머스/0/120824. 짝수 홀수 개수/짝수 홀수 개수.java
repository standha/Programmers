class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[2];
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                answer[0] += 1;
            }else if(num_list[i]%2!=0){
                answer[1] += 1;
            }
        }
        return answer;
    }
}