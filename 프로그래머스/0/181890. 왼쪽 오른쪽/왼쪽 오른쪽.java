class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int k = 0;
        int num = 0;
        
        for(int i = 0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                answer = new String[i];
                num = i;
                break;
            }else if(str_list[i].equals("r")){
                answer = new String[str_list.length-i-1];
                for(int j = i+1; j<str_list.length; j++){
                    answer[k] = str_list[j];
                    k++;
                }
                break;
            }
        }
        
        for(int n = 0; n<num; n++){
             answer[n] = str_list[n];
        }
        
        
        
        
        return answer;
    }
}