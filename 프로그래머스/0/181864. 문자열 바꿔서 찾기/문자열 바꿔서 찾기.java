//A를 X로 바꾸고 B를 A로 바꾸고 다시 X를 B로 바꾸기 
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
         myString = myString.replace('A','X').replace('B','A').replace('X','B');

        if(myString.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}