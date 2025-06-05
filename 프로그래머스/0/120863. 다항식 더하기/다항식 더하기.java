class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        int xNum = 0;
        for(String str : polynomial.split(" ")){
            if(str.contains("x")){
                xNum += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", ""));
            }else if(!str.equals("+")&&!str.contains("x")){
                num += Integer.parseInt(str);
            }
        }
        
        if (xNum != 0) {
            answer += (xNum == 1 ? "x" : xNum + "x");
        }
        if (num != 0) { 
            if (!answer.isEmpty()) { //answer에 x항 값이 있으면
                answer += " + ";
            }
            answer += num;
        }
        
        return answer;
    }
}