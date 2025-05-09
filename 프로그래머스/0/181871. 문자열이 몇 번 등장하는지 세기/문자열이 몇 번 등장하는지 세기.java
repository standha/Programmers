class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i<= myString.length() - pat.length(); i++){
            //문자열을 i부터 pat문자열 길이+i 만큼 반복적으로 잘라서 비교하기
            if(myString.substring(i,i+pat.length()).equals(pat)){
                answer++;
            }    
        }
        return answer;
    }
}

  
       
