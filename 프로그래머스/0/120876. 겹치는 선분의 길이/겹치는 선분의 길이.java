class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[200]; // 점의 개수 배열 : lines가 앞뒤로 100개씩이기에 200개
        
        for(int[] i : lines){ //2차원배열의 행 하니씩 i배열에 넣기
            int start = i[0]+100;  //0번 인덱스
            int end = i[1]+100;    //0번 인덱스
            for(int k = start; k<end; k++){
                count[k]+=1;  //해당 배열의 길이만큼 -> count 배열 요소 값+1
            }
        }
        for(int j : count){
            if(j>1){ //선분이 두개 이상 겹친 곳 : 값이 1초과인경우
                answer++;
            }
        }
        return answer;
    }
}