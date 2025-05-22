import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray(); //ArrayList는 list.로 사용

        return answer;
    }
}