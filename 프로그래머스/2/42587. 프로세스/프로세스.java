import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //우선순위 큐를 내림차순으로 저장
        PriorityQueue<Integer>pqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i = 0; i<priorities.length; i++){
            pqueue.add(priorities[i]); //우선순위 큐에 저장      
        }
        
        while(!pqueue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(pqueue.peek() == priorities[i]){
                    pqueue.poll(); //큐에서 꺼내기
                    answer++;
                    if(i==location){
                        return answer;
                    }
                    
                }
            }
        }
        return answer;
    }
}