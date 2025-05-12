import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            if(flag[i] == true){   //true면
                for(int j = 0; j<arr[i]*2; j++){
                    list.add(arr[i]);  //arr[i]*2만큼 arr[i]를 저장
                }
            }
            if(flag[i] == false){  //false면
                for(int j = 0; j<arr[i]; j++){
                    list.remove(list.size()-1);  //arr[i]만큼 뒤에서부터 삭제
                }
            }
        }
        //배열로 변환
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}