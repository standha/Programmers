import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] result = new int[4];
        result[0] = a;
        result[1] = b;
        result[2] = c;
        result[3] = d;
        Arrays.sort(result); //오름차순 정렬
        
        if(result[0]==result[3]){ //처음과 마지막이 같으면 다 같은 수
            answer = 1111*result[0];
         //처음과 세번째가 같거나 첫번째와 마지막이 같으면 세숫자가 같은거임
        }else if(result[0]==result[2] || result[1]==result[3]){
            //처음수+마지막수-언제가 중간에 끼여있는 수(result[1])=세수와 다르게 나온 숫자
            answer = (result[1]*10+(result[0]+result[3]-result[1]))*(result                                 [1]*10+(result[0]+result[3]-result[1]));
        //두개씩 같은 수 나올경우
        }else if(result[0]==result[1] && result[2]==result[3]){
            answer = (result[0]+result[3]) * (result[3]-result[0]);
        //두숫자만 같은 경우->3가지
        }else if(result[0]==result[1]){ 
            answer = result[2]*result[3];
        }else if(result[1]==result[2]){
            answer = result[0]*result[3];
        }else if(result[2]==result[3]){
            answer = result[0]*result[1];
        }else{
            answer = result[0];
        }
        return answer;
    }
}