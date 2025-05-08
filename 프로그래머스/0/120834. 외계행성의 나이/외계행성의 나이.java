//아스키코드 => 숫자->문자로 바꾸기 / 소문자는 숫자로 97
class Solution {
    public String solution(int age) {
        String answer = "";
        String st = String.valueOf(age);
        for(int i = 0; i<st.length(); i++){
            //문자를 문자열로 바꾸고 다시 숫자로 바꾼뒤 97 더하기 -> 문자는 바로 int로 변경 불가능
            int num = Integer.parseInt(String.valueOf(st.charAt(i)))+ 97;
            answer += String.valueOf((char)num);
        }
        
        return answer;
    }
}