//문자열 배열 원소들의 길이가 같은것끼리 그룹으로 묶고 큰 그룹 return
import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Map<Integer,Integer> maplist = new HashMap<>();  // 각 그룹의 개수를 저장할 맵
        for(String str : strArr){ //원소 하나씩 String에 저장
            int leng = str.length(); // 원소 하나의 길이를 저장
            maplist.put(leng, maplist.getOrDefault(leng, 0) + 1); 
        }
        
        int maxCount = 0; // 가장 개수가 많은 그룹의 크기
        
        // 가장 개수가 많은 그룹의 크기 찾기
        for(int count : maplist.values()){
            if(count>maxCount){
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}