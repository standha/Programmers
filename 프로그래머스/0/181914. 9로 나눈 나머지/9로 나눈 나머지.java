import java.util.*;
import java.math.BigInteger;
class Solution {
    public int solution(String number) {
        int answer = 0;
        int result = 0;
        char tmp = number.charAt(0);
        
        //첫문자가 숫자면
        if(Character.isDigit(tmp)==true){
            for(int i = 0; i<number.length(); i++){
                result = Integer.parseInt(String.valueOf(number.charAt(i)));
                answer += result;
            }      
        }
        answer = answer%9;
        return answer;
    }
}