class Solution {
    public int solution(int a, int b) {
        int newB = b / gcd(a, b); 
        //2와 5로 나누다가 1이되면 탈출 -> 유한소수
        //2와 5로 나눠질수 없는 수가 등장하면 2를 반환 -> 무한소수
        while (newB != 1) {
            if (newB % 2 == 0){
                newB /= 2;
            } 
            else if (newB % 5 == 0){
                newB /= 5;
            } 
            else return 2;
        }
        return 1;
    }
// 유클리드 호제법!! 두 수의 최대 공약수 구하기
    private int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}