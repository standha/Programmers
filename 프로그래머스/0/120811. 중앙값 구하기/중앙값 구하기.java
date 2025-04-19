import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int result = array.length/2;
        Arrays.sort(array);
        answer = array[result];
        return answer;
    }
}