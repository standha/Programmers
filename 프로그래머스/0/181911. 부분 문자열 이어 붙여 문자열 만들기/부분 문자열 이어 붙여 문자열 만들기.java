class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String result = "";
        for(int i = 0; i<my_strings.length; i++){
            result = my_strings[i];
            answer += result.substring(parts[i][0],parts[i][1]+1);
        }
        return answer;
    }
}