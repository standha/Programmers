class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] result = binomial.split(" ");
        int a = Integer.parseInt(result[0]);
        int b = Integer.parseInt(result[2]);
        //문자열 비교는 .equals()
        if(result[1].equals("+")){
            answer = (a + b);  
        }
        if(result[1].equals("-")){
            answer = a - b;
        }
        if(result[1].equals("*")){
            answer = a * b;
        }
        
        return answer;
    }
}