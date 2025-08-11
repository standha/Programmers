class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num; //오버플로우 때문에 long으로 변경

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;

            if (answer >= 500) { // 500번 이상일 때
                return -1;
            }
        }

        return answer;
    }
}