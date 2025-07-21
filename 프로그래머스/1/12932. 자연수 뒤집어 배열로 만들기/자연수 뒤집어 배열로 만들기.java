import java.util.*;
import java.util.stream.*; 
class Solution {
    public int[] solution(long n) {
        
        List<Integer> list = Arrays.stream(String.valueOf(n).split("")) // Stream<String>
            .map(Integer::parseInt) // String -> Integer
            .collect(Collectors.toList()); // List<Integer>
        
        Collections.reverse(list); // 역순으로 뒤집기
        
        return list.stream().mapToInt(Integer::intValue).toArray(); // int로 다시 변환
        
    }
}