class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int num = n/10;
        answer = (12000*n) + (2000*k) - (num*2000);

        return answer;
    }
}