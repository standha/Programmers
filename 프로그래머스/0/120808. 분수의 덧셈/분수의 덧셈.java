class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        int numer3 = (numer1*denom2) + (numer2*denom1);
        int denom3 = denom1*denom2;
        int max = 1;  //1인 이유는 최대공약수가 없을 수 있음
        
        //최대공약수 구하기
        for(int i = 1; i<=numer3 && i <=denom3; i++){
            if(numer3%i==0 && denom3%i==0){
                max = i;
            }
        }
        
        answer[0]=numer3/max;
        answer[1]=denom3/max;
        return answer;
    }
}