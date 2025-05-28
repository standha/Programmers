class Solution {
    public int solution(int n) {
        int answer = 0;
        if(Math.sqrt(n)%1 == 0){ //제곱근을 1로 나눴을 때 0이면 n은 제곱수
            answer = 1;
        }else {
            answer = 2;
        }
        return answer;
    }
}