import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            if(list.size()==0){
                list.add(arr[i]);
            }else if(!list.contains(arr[i])){  //list배열에 들어있는 값이 arr[i]와 값과 다르면
                if(list.size()==k){ //list 크기가 k와 같으면 추가 x
                    break;
                }else{
                    list.add(arr[i]);
                }
            }
        }
        if(list.size()!=k){ //list 크기가 k와 다르면
            for(int j = list.size(); j<k; j++){  //k만큼 크기의 배열 나머지 값을 -1로 채우기
                list.add(-1);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}