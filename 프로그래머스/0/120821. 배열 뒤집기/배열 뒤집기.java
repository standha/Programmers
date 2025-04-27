import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length];
        for(int i = 0;i<num_list.length;i++){
            answer[i]=num_list[num_list.length-i-1];
        }
        
        // int[] answer = {};
        // answer = new int[num_list.length];
        // String str = "";
        // for(int i = 0; i<num_list.length; i++){
        //     str += num_list[i];
        // }
        // StringBuffer sb = new StringBuffer(str);
        // str = sb.reverse().toString();
        // for(int j = 0; j<str.length(); j++){
        //     int result = (int)(str.charAt(j)-'0');
        //     answer[j] = result;
        // }    
        return answer;
    }
}