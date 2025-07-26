import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        int days = 0;
        
        for(int i=0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] != 0){  
                //나머지가 있으면 작업 일수 +1
                days = ((100 - progresses[i]) / speeds[i]) + 1;
            }else{
                days = ((100 - progresses[i] ) / speeds[i]);
            }
            queue.offer(days); //큐에 넣기
        }
        
        while(!queue.isEmpty()){
            int current = queue.poll(); //큐에서 하나를 꺼내서 현재 작업으로 저장
            int count = 1;
           
           //현재 작업이 다음 작업보다 오래걸리면 배포 못함 (다음 작업 때로 미룸)
           while(!queue.isEmpty() && queue.peek()<=current){
                queue.poll(); //큐에서 반환함
                count++;
           }
            answer.add(count);
        }
    
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}