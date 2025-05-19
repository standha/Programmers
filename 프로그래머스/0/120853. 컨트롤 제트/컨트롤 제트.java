class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] result = s.split(" ");
        
        for (int i = 0; i < result.length; i++) {
            if (!result[i].equals("Z")) {
                answer += Integer.parseInt(result[i]);
            } else if (i > 0) {
                answer -= Integer.parseInt(result[i - 1]);
            }
        }
        
        return answer;
    }
}