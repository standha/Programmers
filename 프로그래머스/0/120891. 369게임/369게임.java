class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
 
        for(int i = 0; i<str.length();i++){
            String result = String.valueOf(str.charAt(i));
            if(result.contains("3") | result.contains("6") | result.contains("9")){
            answer += 1;
            }           
        }

        return answer;
    }
}