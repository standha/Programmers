import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(int i = 0; i<my_string.length(); i++){
            list.add(String.valueOf(my_string.charAt(i)));
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            if (list.get(j).equals(letter)) {
                list.remove(j);
            }
        }
        for(String k : list){
            answer+=k;
        }      
        return answer;
    }
}