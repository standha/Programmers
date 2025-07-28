import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++){
            //배열 자르기
            int[] sliced = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(sliced); //정수 배열 정렬
            answer[i] = sliced[commands[i][2]-1];
        }
        
        return answer;
    }
}