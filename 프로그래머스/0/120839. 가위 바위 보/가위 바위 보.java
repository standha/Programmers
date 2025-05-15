class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] str = rsp.split("");
        System.out.println(1);
        for(String result : str){
            if(result.equals("2")){
                answer += "0";
            }else if(result.equals("0")){
                answer += "5";
            }else if(result.equals("5")){
                answer += "2";    
            }
        }
        return answer;
    }
}