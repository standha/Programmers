class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        //문자하나씩 배열에 담기
        String[] temp = my_string.split("");
        //indices의 원소에해당하는 인덱스 글자 지우기
        for(int i = 0; i<indices.length; i++){
            temp[indices[i]]="";
        }
        //문자열 합치기
        for(String x : temp){
            answer+=x;
        }     
        return answer;
    }
}