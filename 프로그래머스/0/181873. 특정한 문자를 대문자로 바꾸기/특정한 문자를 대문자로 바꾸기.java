//char로 문자 하나씩 alp와 비교 후 같으면 대문자로 아니면 소문자로 변경
class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){ 
            //문자열이라서 .equals() 가능
            if(String.valueOf(my_string.charAt(i)).equals(alp)){
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
                
            }else{
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        
        return answer;
    }
}