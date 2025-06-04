class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){
            answer += 1;
            while(true){ //3의 배수와 숫자 3을 사용하지 않을때까지 반복
                if(answer%3==0){
                    answer += 1;
                }
                if(String.valueOf(answer).contains("3")){
                    answer += 1;
                }
                //3의 배수와 숫자 3을 사용하지 않으면 while문 종료
                if(answer%3!=0 && !String.valueOf(answer).contains("3")){ 
                    break;
                }
            }
        }
      
        return answer;
    }
}