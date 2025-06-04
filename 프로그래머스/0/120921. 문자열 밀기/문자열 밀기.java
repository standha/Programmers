class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str = A;
        if(!A.equals(B)){
            while(true){
                str = String.valueOf(str.charAt(str.length()-1))+str.substring(0, str.length() - 1); //문자열 마지막 단어

                answer += 1;

                if(str.equals(B)){ //B문자열과 동일하면 while문 빠져나옴
                    break;
                }else if(answer==A.length() && !str.equals(B)){ 
                    //A 길이만큼 밀었는데도 B와 같지 않다면 -> B가 될 수 없음
                    answer = -1;
                    break;
                }
            }
        }

        return answer;
    }
}