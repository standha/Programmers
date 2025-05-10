import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] result = myString.split("x");  
        ArrayList<String> list = new ArrayList<>();
        for(String str : result){
            if(!str.isEmpty()){ //문자열이 비어있으면
                list.add(str);
            }
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);  //배열에 넣기
        Arrays.sort(answer);  //정렬
        return answer;
    }
}