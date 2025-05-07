class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int result = num_list.length;
        if(result>=11){
            for(int i = 0; i<num_list.length; i++){
                answer += num_list[i];   
            }
            answer -= 1;
        }else if(result<=10){
            for(int i = 0; i<num_list.length; i++){
                answer *= num_list[i];  
            }
        }  
        return answer;
    }
}