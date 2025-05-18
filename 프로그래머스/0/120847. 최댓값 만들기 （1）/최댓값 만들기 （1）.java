import java.util.*;
class Solution {
    public int solution(int[] numbers) {

        Integer[] result = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        //내림차순 정렬
        Arrays.sort(result,Collections.reverseOrder());
        //Integer -> int
        int[] list = Arrays.stream(result).mapToInt(i->i).toArray();
        
        return list[0]*list[1];
    }
}