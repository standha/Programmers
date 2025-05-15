import java.math.*;
class Solution {
    public String solution(String a, String b) {
       // String answer = String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
   
        BigInteger Biga = new BigInteger(a);
        BigInteger Bigb = new BigInteger(b);
        
        BigInteger sum = Biga.add(Bigb);
        String answer = sum.toString();
        return answer;
    }
}