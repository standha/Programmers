import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] num = String.valueOf(n).split("");
        int[] intnum = new int[num.length];
            
        for(int i = 0; i<num.length; i++){
          intnum[i] = Integer.parseInt(num[i]);
        }
        
        Integer[] arr2 = Arrays.stream(intnum).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder()); //내림차순
        
        //다시 숫자로 합치기
        StringBuilder sb = new StringBuilder();
        for (int i : arr2) {
            sb.append(i);
        }

        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}