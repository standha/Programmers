import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i<my_string.length(); i+=m){
            String str = my_string.substring(i,i+m);
            result.add(str);
        }

        for(String k : result){
            answer += k.substring(c-1,c);
        }
        return answer;
    }
}