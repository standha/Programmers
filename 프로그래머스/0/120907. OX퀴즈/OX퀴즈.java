class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int num = 0;
        
        for(int i = 0; i<quiz.length; i++){
            String str = quiz[i];
            String[] result = str.split(" "); //배열에 문자열을 공백으로 나눈 기준으로 담기
            if(result[1].equals("-")){
                num = Integer.parseInt(result[0])-Integer.parseInt(result[2]);
                if(num != Integer.parseInt(result[4])){
                    answer[i] = "X";
                }else{
                    answer[i] = "O";
                }
            }else if(result[1].equals("+")){
                num = Integer.parseInt(result[0])+Integer.parseInt(result[2]);
                if(num != Integer.parseInt(result[4])){
                    answer[i] = "X";
                }else{
                    answer[i] = "O";
                }
            }
        }
        return answer;
    }
}