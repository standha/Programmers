import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int num = rank.length;
        
        for(int i = 0; i < num; i++){
            if(attendance[i] == false){
                rank[i] = 0; //해당 값을 0으로 바꾸기
            } 
        }
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int j=0; j < num; j++){
            if(rank[j] != 0){
                map.put(rank[j],j);  //0이 아니면 map에 넣기
            } 
        }
        
        ArrayList<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);  //클래스의 객체 정렬(오름차순)
        
        int a = map.getOrDefault(keySet.get(0),0);
        int b = map.getOrDefault(keySet.get(1),0);
        int c = map.getOrDefault(keySet.get(2),0);
        
        return (10000*a) + (100*b) + c;
    }
}