//문자열 길이만큼 반복해서
//a이면 대문자로 변경, a가 아니면 소문자로
class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                //문자를 문자열로 변경후 toUpperCase() 진행
                answer += String.valueOf(myString.charAt(i)).toUpperCase();
            }else{ //문자를 문자열로 변경후 toLowerCase() 진행
                answer += String.valueOf(myString.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}