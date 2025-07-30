class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        
        String str = String.valueOf(x);
        String[] result = str.split(""); 
        
        for(int i = 0; i<result.length; i++){
            num += Integer.parseInt(result[i]); //자릿수를 더한다
        }
        
        if((x % num) != 0){
            answer = false;
        } 
        
        return answer;
    }
}