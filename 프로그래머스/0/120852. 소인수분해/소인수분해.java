import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        //어떤 N이 두 개이상 곱셈(인수)으로 나타낼 수 있을 때 인수 중 한 개 이상은 반드시 √N보다 작거나 같다
        for(int i = 2; i*i<=n; i++){
            while(n%i==0){  //나눴을 때 0이면 소인수
                if(!list.contains(i)){ //list안에 동일한 값이 없으면 추가
                    list.add(i);
                }
                n/=i;  //n의 값을 i로 나눠줬으니까 n의 값도 변경
            }
        }
        //마지막으로 남는 수가 있는데 해당 수가 1이면 소인수가 이니기에 1이 아니면 추가
        if(n!=1){
            list.add(n);
        }    
                
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}