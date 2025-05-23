class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] result = message.split("");
        answer = (result.length)*2;
        return answer;
    }
}