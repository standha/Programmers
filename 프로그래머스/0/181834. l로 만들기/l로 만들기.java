class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i)<109){ //l보다 앞선 문자일 시
                answer += "l";
            }else{
                answer += myString.charAt(i);
            }
        }
        
        return answer;
    }
}