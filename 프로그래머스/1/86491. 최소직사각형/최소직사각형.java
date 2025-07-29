class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_v = 0;
        int max_h = 0;

        for(int i = 0; i<sizes.length; i++){
            //명함은 회전이 가능하니까 둘중에서 더 큰 수를 높이와 가로로 정한다.
            int v = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            //max_v와 v중에서 더 큰 수를 정한다. 
            //(for문 돌면서 max_v에 v가 저장됨 그러면 새로 들어온 v와 또 비교해야함)
            max_v = Math.max(max_v,v);
            max_h = Math.max(max_h,h);
        }

        answer= max_v * max_h;

        return answer;
    }
}