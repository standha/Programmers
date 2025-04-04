class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        //.substing 사용해서 s번째까지 단어 추출
        String before = my_string.substring(0,s);
        //추출한 단어 길이 + overwrite_string길이를 더한 위치부터 끝까지 단어 추출
        String after = my_string.substring(before.length()+overwrite_string.length());
        answer = before+overwrite_string+after;
        
        return answer;
    }
}       