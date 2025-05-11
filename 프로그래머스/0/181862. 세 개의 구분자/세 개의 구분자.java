import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        //정규식으로 a,b,c 로 구분해서 문자열 나누기
        String[] result = myStr.split("a|b|c");
        for(int i = 0; i<result.length; i++){
            if(!result[i].isEmpty()){
                list.add(result[i]);
            }
        }
        //ArrayList 배열이 비어있으면
        if(list.size()==0){
            list.add("EMPTY");
        }
        String[] answer = list.toArray(String[] :: new);

        return answer;
    }
}