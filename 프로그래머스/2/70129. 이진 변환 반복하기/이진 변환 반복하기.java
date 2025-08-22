class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int num = 0;
        int result = 0;
        
        while(!s.equals("1")){
            int leng = 0; //1을 더한 개수(문자열의 길이)는 매번 달라져야하기에 for문 안에 선언
            for(char c : s.toCharArray()){ //String -> char
                if(c == '0'){
                    num++; //0의 개수
                }else{
                    leng++; //1의 개수 (문자열의 길이)
                }
            }
            s = Integer.toBinaryString(leng); // 10진수 -> 2진수
            result++; //회차 개수
        }
        answer = new int[]{result,num};
        return answer;
    }
}