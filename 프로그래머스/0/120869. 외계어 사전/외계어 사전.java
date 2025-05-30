class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2; //디폴트 값을 존재하지 않는 2로 
      
        for(int i = 0; i<dic.length; i++){  //dic배열의 길이만큼 반복
            int result = 0;
            String str = dic[i];  //dic[i] 요소값을 문자열로 변경
            for(int j = 0; j<spell.length; j++){  //spell배열 길이만큼 반복
                if(str.contains(spell[j])){ //spell의 요소 하나씩 str에 포함되는지 확인
                    result += 1;  //포함되면 +1
                }
                //두 값이 같다는것은 spell요소가 모두 str에 들어있다는 의미
                if(result == spell.length){  
                    answer = 1; // 값이 존재하는 1로 변경
                }
            }
        }
        return answer;
    }
}