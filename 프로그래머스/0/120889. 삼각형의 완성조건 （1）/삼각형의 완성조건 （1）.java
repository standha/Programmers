import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides); //가장 긴변과 다른 두변을 더한것을 비교하기 위해서 정렬
        
        if(sides[0]+sides[1]>sides[2]){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}