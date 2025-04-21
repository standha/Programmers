import java.util.*;

class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        // 빈도수를 저장할 map 생성
        Map<Integer, Integer> result = new HashMap<>();

        for(int num : array) {
        // map에 현재 값 num에 대한 빈도수를 가져와서 1을 더한 값을 count에 저장
            int count = result.getOrDefault(num,0) + 1;

            if(count > maxCount) {
            // 현재 값의 빈도수가 최대 빈도수보다 크면, 최대 빈도수와 최빈값 갱신
                maxCount = count;
                answer = num;
            }

            else if(count == maxCount) {
            // 현재 값의 빈도수가 최대 빈도수와 같으면 -1
                answer = -1;
            }
			// 현재 값을 빈도수와 함께 저장
            result.put(num, count);
        }

        return answer;
    }
}
