import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        for(int i = 0; i<numlist.length; i++){
            for(int j = 0; j<numlist.length; j++){
                if(Math.abs(numlist[i]-n)<=Math.abs(numlist[j]-n)){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        for(int k = 0; k<numlist.length; k++){
            answer[k]=numlist[k];
        }
        
        return answer;
    }
}