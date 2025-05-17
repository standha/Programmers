class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1; // 1부터 n^2까지 채움
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (num <= n * n) {
            // 오른쪽
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++;

            // 아래쪽
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--;

            // 왼쪽
            for (int i = right; i >= left; i--) {
                answer[bottom][i] = num++;
            }
            bottom--;

            // 위쪽
            for (int i = bottom; i >= top; i--) {
                answer[i][left] = num++;
            }
            left++;
        }

        return answer;
    }
}
