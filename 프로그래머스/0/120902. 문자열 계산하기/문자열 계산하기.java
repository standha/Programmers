class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 공백 제거하고 + 기준으로 split -> 기호를 기준으로 앞뒤 공백 제거
        String[] result = my_string.split(" ");
        answer += Integer.parseInt(result[0]);
        for(int i = 1; i<result.length; i++){
            if(result[i].equals("+")){
                answer += Integer.parseInt(result[i+1]);
            }else if(result[i].equals("-")){
                answer -= Integer.parseInt(result[i+1]);
            }
        }
        return answer;
    }
}