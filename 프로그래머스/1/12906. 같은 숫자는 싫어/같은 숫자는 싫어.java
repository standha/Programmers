import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        Stack<Integer> stack = new Stack(); //스택 생성
        for(int i : arr){
            if(stack.isEmpty() || stack.peek() != i){ //비어있으면 무조건 첫번째 값이니까 넣음
                stack.push(i); 
                answer.add(i); //배열에 넣기
            }   
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray(); //int로 변경
    }
}