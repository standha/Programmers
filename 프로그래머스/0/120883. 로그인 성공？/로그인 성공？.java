class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int result = 0;
        for(int i = 0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0])){
                if(db[i][1].equals(id_pw[1])){
                    answer = "login";
                    result +=1;
                }else if(!db[i][1].equals(id_pw[1])){
                    answer = "wrong pw";
                    result +=1;
                }
                break;
            }else if(!db[i][0].equals(id_pw[0])){
                answer = "fail";
            }        
        }
        return answer;
    }
}