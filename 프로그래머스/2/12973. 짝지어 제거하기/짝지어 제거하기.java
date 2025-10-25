import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
         for(char c : s.toCharArray()){
             //stack사이즈가 0보다 크거나 위에 있는 요소가 c 와 같을 때는 
             //stack에 있는 요소 꺼내기 (없애야함)
             if(stack.size() > 0 && stack.peek()==c){ 
                 stack.pop();
             }
             else{
                 stack.push(c); //다르면 해당 문자 stack에 쌓기
             }
         }
        if(stack.isEmpty()){
            answer = 1; 
        }

        return answer;
    }
}