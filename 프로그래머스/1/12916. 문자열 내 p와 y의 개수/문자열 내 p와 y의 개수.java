import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pnum = 0;
        int ynum = 0;
        
        String str = s.toUpperCase(); //모두 대문자로 변경
        
        for(int i = 0; i<s.length(); i++){
            if(str.charAt(i)=='P'){
                pnum += 1;
            }
            if(str.charAt(i)=='Y'){
                ynum += 1;
            }
        }
        
        if(pnum != ynum){
            answer = false;
        }

        return answer;
    }
}