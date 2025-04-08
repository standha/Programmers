class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String result1 = "";
        String result2= "";
        String str= "";
        //char[] ch = new char[num_list.length];

       // String result = String.valueOf()
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                String st1 = String.valueOf(num_list[i]);
                result1+=st1;  
            }else if(num_list[i]%2!=0){
                String st2 = String.valueOf(num_list[i]);
                result2+=st2;
            }             
        }
        
        Integer answer1 = Integer.parseInt(result1);
        Integer answer2 = Integer.parseInt(result2);
        answer = answer2+answer1;
        return answer;
    }
}