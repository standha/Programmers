import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int j = 0; j<query.length; j++){
            if(j%2==0){
                arr = Arrays.copyOfRange(arr,0,query[j]+1); //copyOfRange -> 배열 복사
            }else if(j%2!=2){
                arr = Arrays.copyOfRange(arr,query[j],arr.length);
            }           
        }    
        return arr;
    }
}