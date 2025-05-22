class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] result = new String[my_string.length()];
        String temp = "";
        for(int i = 0; i<my_string.length(); i++){
            result[i]=String.valueOf(my_string.charAt(i));   
        }
        temp = result[num1];
        result[num1] = result[num2];
        result[num2]= temp;
        
        for(String str : result){
            answer += str;
        }

        return answer;
    }
}