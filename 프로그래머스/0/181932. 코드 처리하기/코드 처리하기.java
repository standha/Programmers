class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode= false;
        for(int i=0; i<code.length();i++){
            char ch = code.charAt(i);
            //초기 mode->0
            if(ch=='1'){
                mode = !mode; //0->1 / 1->0
                continue;
            }
            //mode가 0이면 인덱스가 짝수일떄만
            if(!mode){
                if(i%2==0){
                    answer += ch;
                }
            }else if(mode) {  //mode가 1이면 인덱스가 홀수일떄만
                if(i%2!=0){
                    answer += ch;
                }
            }
        }
        
        if(answer.equals("")){
            answer = "EMPTY";
        }

        return answer;
    }
}