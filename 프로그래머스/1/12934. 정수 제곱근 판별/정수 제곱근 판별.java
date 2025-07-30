class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n); // 제곱근 판별 -> double 형
        
        //계산된 제곱근 sqrt가 정수인지 확인 
        //만약 제곱근이 정수라면, sqrt는 long으로 형변환했을 때 원래 값과 동일
        if(sqrt == (long)sqrt) {
            answer = (long)Math.pow(sqrt+1 ,2); 
        }else{
            answer = -1;
        }
        
        return answer;
    }
}