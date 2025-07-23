import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>(); //스택 생성
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c); //값 삽입
            }else if(c==')'){
               if (stack.isEmpty()) {
                    answer = false; // 짝이 안 맞음
                    break;
                }
                stack.pop(); //값 반환한 뒤 삭제 -> 짝 맞추기        
            }
        }

        // 마지막에 스택이 비어 있지 않으면 괄호 짝 안 맞음
        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}