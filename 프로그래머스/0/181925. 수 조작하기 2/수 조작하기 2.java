class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 1; i<numLog.length; i++){
            //i를 0번부터 시작하면 numLog[i-1]이 [-1]이 되어 범위 나감
            //numLog.length+1 까지 돌면 numLog[i]이 범위 나감
            if((numLog[i]-numLog[i-1])==1){
                answer+= "w";        
            } else if((numLog[i]-numLog[i-1])==-1){
                answer+= "s";          
            }else if((numLog[i]-numLog[i-1])==10){
                answer+= "d";           
            }else if((numLog[i]-numLog[i-1])==-10){
                answer+= "a";           
            }
        }
        
        
        return answer;
        
    }
    
}