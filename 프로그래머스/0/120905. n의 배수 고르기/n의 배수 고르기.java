import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : numlist){
            if(num%n == 0)
                result.add(num);
        }
        
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}