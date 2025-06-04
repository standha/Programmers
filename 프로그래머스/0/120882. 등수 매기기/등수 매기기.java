class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] answer = new int[score.length];
        //평균 값 구해서 넣기
        for(int i = 0; i<score.length; i++){
            //평균 계산 시 소수점 이하 손실 막기 위해서 double 타입
            double result = (double)(score[i][0]+score[i][1])/2.0; 
            avg[i] = result;
        }
        //등수 매기기
        //rank라는 변수를 선언하고 1로 초기화 후 비교해서 ++
        for (int i = 0; i < avg.length; i++) {
            int rank = 1;
            for (int j = 0; j < avg.length; j++) {
                if (avg[i] < avg[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}