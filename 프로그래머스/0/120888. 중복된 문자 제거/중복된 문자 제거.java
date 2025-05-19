class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] result = new String[my_string.length()];
        for(int i = 0; i<my_string.length(); i++){
            //.contains은 string이고 ArrayList일때만 가능
            //String일 경우 -> String배열.contains(String배열)
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                answer += String.valueOf(my_string.charAt(i));
            }            
        }
        return answer;
    }
}