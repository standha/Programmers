class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        int result = myString.lastIndexOf(pat);  //pat문자열이 포함된 마지막 인덱스(문자열 앞 인덱스)
        answer = myString.substring(0,result)+pat;

        return answer;
    }
}