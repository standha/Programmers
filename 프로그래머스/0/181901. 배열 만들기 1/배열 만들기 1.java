import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        answer = new int[n/k];
        for(int i = 1; i<=answer.length; i++) {
            answer[i-1]= i*k;
        }
        Arrays.toString(answer);
        
        return answer;
    }
}