class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[(picture.length)*k];
        String str = "";
        for(int i = 0; i<picture.length; i++){
            str = picture[i]; //배열값을 문자열로 변환
            StringBuilder result = new StringBuilder();
            //가로
            for(int j = 0; j<str.length(); j++){
               for(int h = 0; h<k; h++){
                   result.append(str.charAt(j));
               }
            }
            //세로
            for(int  m = (i*k); m<(i*k)+k; m++){
                answer[m] = result.toString();   
            }
        }
        return answer;
    }
}