import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        BigInteger bignum = new BigInteger("1");
        
        for (int i = 0; i < share; i++) {
            bignum = bignum.multiply(BigInteger.valueOf(balls - i));
            bignum = bignum.divide(BigInteger.valueOf(i + 1));
        }
        answer = bignum.intValue();
        return answer;
    }
}