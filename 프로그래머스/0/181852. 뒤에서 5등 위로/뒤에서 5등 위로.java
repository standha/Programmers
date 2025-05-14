import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        //int -> Integer로 변경
        Integer[] result = Arrays.stream(num_list).boxed().toArray(Integer[]::new);
        //내림차순 정렬
        Arrays.sort(result,Collections.reverseOrder());
        //Integer -> int
        int[] list = Arrays.stream(result).mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(list));
        for(int i = 0; i<answer.length; i++){
            answer[answer.length-1-i]=list[i];
        }
        return answer;
    }
}