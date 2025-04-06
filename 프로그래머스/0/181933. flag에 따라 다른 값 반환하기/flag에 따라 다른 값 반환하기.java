class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        //boolean값이라서 .equals비교 x => 대신 !로 참/거짓 판단
        if(!flag){
            return a-b;
        }else{
            return a+b;
        }
    }
}