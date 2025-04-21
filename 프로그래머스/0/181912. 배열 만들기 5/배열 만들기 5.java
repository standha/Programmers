import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String str = "";
        ArrayList<Integer> answer = new ArrayList<>();
        int[] answer1 = {};
        for(int i = 0; i<intStrs.length; i++){
            str = intStrs[i];
            str = str.substring(s,s+l);
            int result = Integer.parseInt(str);
            if(result > k){
                answer.add(result);
            }
        }
        answer1 = new int[answer.size()];
        for(int j = 0; j<answer.size(); j++){
            answer1[j] = answer.get(j);
        }
        return answer1;
    }
}