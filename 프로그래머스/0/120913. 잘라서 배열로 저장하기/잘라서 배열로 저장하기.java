class Solution {
    public String[] solution(String my_str, int n) {
        int num = my_str.length()/n;
        if(my_str.length()%n > 0){
            num += 1;
        }
        
        String[] answer = new String[num];
        for(int i = 0; i<num; i++){
            if(my_str.length()>n){
                answer[i] = my_str.substring(0,n);
                my_str = my_str.substring(n, my_str.length()); //담긴 문자열은 자르기
            }else{
                answer[i] = my_str.substring(0,my_str.length());
            }
        }
        
        return answer;
    }
}