import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] result = new String[my_string.length()];
        String str = my_string.toLowerCase();
        for(int i = 0; i<str.length(); i++){
            result[i] = String.valueOf(str.charAt(i));
        }
        Arrays.sort(result);
        for(String k : result){
            answer += k;
        }
        
        return answer;
    }
}