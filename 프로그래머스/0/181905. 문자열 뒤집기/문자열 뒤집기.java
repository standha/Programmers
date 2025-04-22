import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String result = "";
        String result1 = "";
        String result2 = "";
        
        answer = my_string.substring(s,e+1);
        StringBuffer str = new StringBuffer(answer);
        
        result=str.reverse().toString(); //StringBuffer를 String으로 바꾸기 -> .toString()
        result1=my_string.substring(0,s);
        result2=my_string.substring(e+1);
        
        answer = result1+result+result2;
        
        return answer;
    }
}