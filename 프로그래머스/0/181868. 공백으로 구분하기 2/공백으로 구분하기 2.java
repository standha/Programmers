import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        //\\s+ 는 연속된 공백을 하나의 공백으로 처리하는 정규식 표현
        String[] answer = my_string.trim().split("\\s+"); 
        return answer;
        
        // ArrayList<String> list = new ArrayList<>();
        // String str = my_string.trim(); //앞뒤 공백 제거
        // String[] result = str.split(" "); //공백으로 나눠서 배열에 저장
        // for(int i = 0; i<result.length; i++){
        //     if(result[i] != " "){
        //         list.add(result[i]);
        //     }
        // }
        // String[] answer = list.toArray(String[] :: new); //string배열로 변경
    }
}