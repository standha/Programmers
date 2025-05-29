class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int num : array){ //배열을 문자열로 변환
            str += String.valueOf(num); 
        }
        for(int i = 0; i<str.length(); i++){
            if(String.valueOf(str.charAt(i)).equals("7")){  //문자하나씩 꺼내서 7과 동일하면 +1
                answer += 1;               
            }
        }
        return answer;
    }
}