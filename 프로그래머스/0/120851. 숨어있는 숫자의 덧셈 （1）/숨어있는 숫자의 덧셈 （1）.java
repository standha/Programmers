class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String result = my_string.replaceAll("[^0-9]","");

        for(int i = 0; i<result.length(); i++){
            answer += Integer.parseInt(String.valueOf(result.charAt(i)));
        }

        return answer; 
    }
}