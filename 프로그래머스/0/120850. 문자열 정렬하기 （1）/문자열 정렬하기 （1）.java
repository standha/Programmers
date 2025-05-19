import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String result = my_string.replaceAll("[^0-9]",""); //숫자 제외한 값 빈값으로 변환
        
        int[] answer = new int[result.length()];
        for(int i = 0; i<result.length(); i++){
            answer[i] = Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        Arrays.sort(answer);
        return answer;
    }
}