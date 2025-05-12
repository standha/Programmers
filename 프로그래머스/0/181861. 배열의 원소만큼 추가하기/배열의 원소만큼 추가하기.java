import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                list.add(arr[i]);
            }
        }
        //ArrayList배열을 int배열로 변경
       int[] answer = list.stream().filter(i -> i != null)
                    .mapToInt(i -> i)
                    .toArray();
        return answer;
    }
}