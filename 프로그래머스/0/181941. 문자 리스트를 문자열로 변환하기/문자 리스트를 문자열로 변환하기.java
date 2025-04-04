class Solution {
    public String solution(String[] arr) {

        StringBuffer sf = new StringBuffer();
        
        for(String s: arr){
            //.append(s) ->s값을 sf에 추가
            sf.append(s);
        }
        return sf.toString();
    
    }
}