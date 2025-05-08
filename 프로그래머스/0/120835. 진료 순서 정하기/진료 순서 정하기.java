//배열에 있는 값 비교해서 순위 매기기
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer = new int[emergency.length];
        //Integer[] result = Arrays.stream(emergency).boxed().toArray(Integer::new);
        //Arrays.sort(result,Collection.reverse.Order());
        for(int i = 0; i<emergency.length; i++){
            int rank = 1; //순위 매기기
            for(int j = 0; j<emergency.length; j++){
               if (emergency[i] < emergency[j]) {  //값 비교 -> 크면
                    rank++;  //순위 +1
                }
            }
            answer[i] = rank; //순위 배열에 넣어주기
        }
        
        return answer;
    }
}