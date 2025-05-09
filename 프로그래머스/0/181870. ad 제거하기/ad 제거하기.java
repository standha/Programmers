import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for (String str : strArr) { //strArr에 있는 요소 하나씩 str에 넣기
            if (!str.contains("ad")){ //str문자열에 ad가 포함안되면
                list.add(str);
            }
        }
        String[] answer = list.toArray(String[]::new);
        return answer;
    }
}