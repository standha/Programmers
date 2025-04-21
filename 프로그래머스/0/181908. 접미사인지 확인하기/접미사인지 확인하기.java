class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String result = "";
        for(int i=0; i<my_string.length(); i++){
            result = my_string.substring(i,my_string.length());
            if(result.equals(is_suffix)){
                answer = 1;
            }
        }
        
        return answer;
    }
}