/*V 하나라도 T면 T
  ^ 둘다 T면 T 
  */
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean result1 = true;
        boolean result2 = true;
        
        if(x1==true || x2==true){
            result1 = true;
        }else if(x1!=true && x2!=true){
            result1 = false;
        }
        
        if(x3==true || x4==true){
            result2 = true;
        }else if(x3!=true && x4!=true){
            result2 = false;
        }
        if(result2==true && result1==true){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}