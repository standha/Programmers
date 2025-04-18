import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while(true){
            //stk가 빈배열이면
            if(stk.size()==0){ //ArrayList -> stk.isEmpty() 사용
                stk.add(arr[i]);
                i++;
            }
            //배열에 값이 있고 마지막 값이 arr[i] 보다 작으면 배열 마지막에 arr[i] 넣기
            if(stk.size()!=0 && stk.get(stk.size()-1)<arr[i]){//ArrayList->stk.get(stk.length -1)
                stk.add(arr[i]);
                i++;
            //배열에 값이 있고 마지막 값이 arr[i] 보다 크면 배열 마지막 값 지우기
            }else if(stk.size()!=0 && stk.get(stk.size()-1)>=arr[i]){
                stk.remove(stk.size()-1);
            }
            if(arr.length == i){
                break;
            }
        }  
        
        int[] stks=new int[stk.size()];//int배열로 변경
        for(int k=0;k<stk.size();k++){
            stks[k]=stk.get(k).intValue(); //integer형에서 int값 추출
        }
        return stks;
    }
}