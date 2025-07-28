import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] answer = new String[numbers.length];
        StringBuilder sb = new StringBuilder();  //변경 가능한 문자열 생성 (String을 합치는 작업)
        
        for(int i = 0; i<answer.length; i++){
            answer[i] = Integer.toString(numbers[i]); //int형 배열을 문자열 배열로 변경
        }
        
        //두 수를 합친 값이 큰 순서대로 (내림차순)
        //비교하는 두 숫자를 앞 뒤로 번갈아가며 이어붙여서 합친 값이 큰 것을 구한다. 
        Arrays.sort(answer, (a,b)->(b + a).compareTo(a + b)); 
        
        if(answer[0].equals("0")){ //배열 첫값이 0이면 그냥 0인거임
            return "0";
        }
        
        for(String s : answer){
            sb.append(s); // StringBuilder에 추가
        }
        
        return sb.toString();  //String으로 변환
    }
}