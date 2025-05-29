import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //두수가 음수면 뒤에서 2개의 수를 곱하는게 제일큼
        //두수가 양수면 앞에서부터 2개의 수를 곱하는게 제일 큼
        Arrays.sort(numbers);
        int max1 = numbers[0]*numbers[1];
        int max2 = numbers[numbers.length-2]*numbers[numbers.length-1];
        answer=max1>max2?max1:max2; 
        
        return answer;
    }
}