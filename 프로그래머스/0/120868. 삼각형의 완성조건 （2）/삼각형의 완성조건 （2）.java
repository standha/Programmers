import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        String str ="";
         Arrays.sort(sides);
        //나머지 변이 가장 긴 변일 경우
        for(int i = sides[1]+1; i<(sides[0] + sides[1]); i++){
            if(i<sides[0] + sides[1]){
                answer +=1;
            }
        }
        //sides배열에서 가장 큰 값이 가장 긴 변일 경우
        for(int i = sides[1]; i>0; i-- ){
            if(i+sides[0]>sides[1]){ 
                answer +=1;
            }
        }
        return answer;
    }
}