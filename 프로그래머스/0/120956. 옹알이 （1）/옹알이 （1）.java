class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] check= {"aya", "ye", "woo", "ma"};
        
        for(String b : babbling) {  //babbling에 있는 값을 하나씩 꺼내옴
            for(String c : check) { //check에 있는 값을 하나씩 꺼내옴
                //b에 c가 있으면 일단 전부 공백으로 변경(나머지를 구분 하기위해)
                b=b.replace(c, " ");
            }
            //공백처리한 b 에 있는 공백을 없에고 남은게 아무것도 없으면
            if(b.replaceAll(" ", "").equals("")) {  
                answer++;   //answer에 카운트+1
            }
        }
        return answer;
    }
}