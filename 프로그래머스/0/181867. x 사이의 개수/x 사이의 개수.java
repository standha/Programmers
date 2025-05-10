class Solution {
    public int[] solution(String myString) {
        String[] findx = myString.split("x"); //x기준으로 나누기
        int[] answer = new int[findx.length];
        
        //마지막에x가 있으면 뒤에 공백으로 하나 더 저장됨
        if(myString.charAt(myString.length()-1)=='x'){ 
            answer = new int[findx.length+1];
        }
        
        for (int i=0; i<findx.length; i++) {
            answer[i] = findx[i].length();
        }
        return answer;
    }
}
