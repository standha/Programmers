class Solution {
    public String solution(String letter) {
        String answer = "";
        int index = 0;
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] result = letter.split(" ");
        for(String str : result){
            for(int i = 0; i<mos.length; i++){
                if(mos[i].equals(str)){
                    answer += (char)(i + 97);  // 인덱스를 알파벳 문자로 변환
                    break;
                }
                    
            }
        }
        return answer;
    }
}