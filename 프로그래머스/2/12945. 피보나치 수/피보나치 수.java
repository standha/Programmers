class Solution {
    // 피보나치 수열 값을 저장할 배열
    int[] data = new int[100001];

    public int solution(int n) {
        // 피보나치 수열 값을 계산하는 함수 호출 및 반환
        return fibo(n);
    }

    private int fibo(int n) {
        // n이 0 또는 1일 경우 그대로 반환
        if (n <= 1) {
            return n;
        }

        // 이미 계산된 값이 있다면 반환
        if (data[n] != 0) {
            return data[n] % 1234567;
        }

        // 재귀적으로 피보나치 수열 값을 계산하고 저장 (재귀호출)
        return data[n] = (fibo(n - 2) + fibo(n - 1)) % 1234567; 
    }
}