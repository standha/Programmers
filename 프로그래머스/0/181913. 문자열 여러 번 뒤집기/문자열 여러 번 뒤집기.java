import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;
        String result1 = "";
        String result2 = "";
        String result = "";
        StringBuffer sb = new StringBuffer();  //문자 뒤집기 함수 사용 위해
        for(int i = 0; i<queries.length; i++){
            num1 = queries[i][0];
            num2 = queries[i][1];
            if(num1!=0){
                result1 = my_string.substring(0,num1);
            }else{
                result1="";
            }
            if(num2!=my_string.length()-1){
                result2 = my_string.substring(num2+1,my_string.length());
            }else{
                result2="";
            }
            
            result = my_string.substring(num1,num2+1);
            sb = new StringBuffer(result);  //String은 StirngBuffer로 바꿔서 저장
            sb = sb.reverse();  //뒤집기
            my_string = result1+sb+result2;//바뀐 문자로 계속 이어가야함-> my_string에 저장

        }
        answer = my_string;
        return answer;
    }
}