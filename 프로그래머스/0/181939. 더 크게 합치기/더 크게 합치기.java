class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int result = 0;
        int result1 = 0;
        //숫자->문자
        String str = String.valueOf(a);
        String str1 = String.valueOf(b);
        //문자 더하기
        String ab = str+str1;
        String ab1 = str1+str;
        //더한문자->숫자
        result = Integer.parseInt(ab);
        result1 = Integer.parseInt(ab1);
        if(result>result1){
            answer = result;
        }else if(result<result1){
            answer = result1;
        }else if(result == result1){
            answer = result;
        }
        
        
        return answer;
    }
}