class Solution {
    public int solution(int n) {
        int count1 = Integer.bitCount(n); // 2진수에서 1의 개수
        int num = n + 1;
        
        while (true) {
            if (Integer.bitCount(num) == count1) { // 1의 개수가 같으면 종료
                return num;
            }
            num++;
        }
    }
}