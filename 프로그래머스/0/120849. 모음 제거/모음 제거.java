import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i) == 'a' || my_string.charAt(i) == 'e'      || my_string.charAt(i) == 'i' || my_string.charAt(i) == 'o' || my_string.charAt(i) == 'u' ){
                continue;
            }else{      
                list.add(String.valueOf(my_string.charAt(i)));
            }
        }
        for(String str: list){
            answer += str;
        }
      
        return answer;
    }
}
