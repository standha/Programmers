class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //뒷자리 4개 제외한 문자
        String str = phone_number.substring(0,phone_number.length()-4); 
        for(int i =0; i<str.length(); i++ ){
            answer += "*";
        }
        //뒷자리 4개
        answer += phone_number.substring(str.length(),phone_number.length());
        
        return answer;
    }
}