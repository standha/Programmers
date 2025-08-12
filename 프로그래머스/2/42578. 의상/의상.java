import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        //의상 종류의 개수 담기
        for(String[] clothe : clothes){
            map.put(clothe[1], map.getOrDefault(clothe[1],0)+1);
        }
        
        //map을 순회할 iterator
        Iterator<Integer> it = map.values().iterator();
        // Map의 값들을 순회하면서 경우의 수 계산
        while(it.hasNext()){
            answer *= it.next() + 1;
        }

        return answer-1;
    }
}