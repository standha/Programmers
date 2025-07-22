class Solution {
    public int solution(String s) {
        int answer = 0;
         String str = "";
        
        if(s.charAt(0)=='-') {
            str = s.substring(1,s.length());
             answer = (Integer.parseInt(str)) * -1;
        }else{
            str = s.substring(0,s.length());
             answer = Integer.parseInt(str);
        }

        return answer;
    }
}