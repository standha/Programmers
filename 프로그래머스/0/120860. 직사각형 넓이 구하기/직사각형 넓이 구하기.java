class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        //X좌표 : 첫번째 오소
        //Y좌표 : 두번째 요소
        int minX = dots[0][0]; //X좌표 최솟값
        int minY = dots[0][1];//Y좌표 최솟값
        int maxX = dots[0][0];//X좌표 최댓값
        int maxY = dots[0][1];//Y좌표 최댓값
        //X Y 좌표의 최솟값, 최댓값을 구하기 위해 Math클래스의 min(),max()사용
        for(int i = 0; i<dots.length; i++){
            minX=Math.min(minX,dots[i][0]);
            minY=Math.min(minY,dots[i][1]);
            maxX=Math.max(maxX,dots[i][0]);
            maxY=Math.max(maxY,dots[i][1]);
        }
        answer = (maxX - minX)*(maxY-minY);
        return answer;
    }
}