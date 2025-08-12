import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] people1 = {1,2,3,4,5};
        int[] people2 = {2,1,2,3,2,4,2,5};
        int[] people3 = {3,3,1,1,2,2,4,4,5,5};
        
        // 맞춘 개수를 담을 배열
        int[] score = new int[3];
        
        // 맞춘 개수 구하기
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == people1[i % 5]) score[0]++;
            if (answers[i] == people2[i % 8]) score[1]++;
            if (answers[i] == people3[i % 10]) score[2]++;
        }
        
        // 가장 많이 맞춘 개수
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> answer = new ArrayList<>();
        
        // 가장 많이 맞춘 사람 담기 -> 오름차순
        for (int i = 0; i < 3; i++) {
            if (maxScore == score[i]) answer.add(i + 1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}