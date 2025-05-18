class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){  //n번만큼 반복
            int cnt = 0;
            for(int j = 1; j<=i; j++){ //n번만큼 반복할때 i값이 숫자라고 생각하고 i번까지 반복
                if(i%j == 0){ //숫자를 j로 나눴을 때 나머지가 0이면 약수
                    cnt++;
                }
            }
            if(cnt>=3){
                answer++;
            }
        }
        return answer;
    }
}