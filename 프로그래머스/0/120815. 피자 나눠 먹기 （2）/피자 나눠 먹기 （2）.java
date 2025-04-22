class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%6==0){
            answer = n/6;
        }else{
            /*6의 배수가 되는 수를 *
            그 수를 다시 6으로 나누기*/
            for(int i=1; i<17; i++){
                if((n*i)%6==0){
                    answer = (n*i)/6;
                    break;
                }
            }
        }
        
        return answer;
    }
}