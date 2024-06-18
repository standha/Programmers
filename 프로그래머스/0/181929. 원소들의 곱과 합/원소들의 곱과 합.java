class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mult = 1; //x라서 기본을 1로
        
        //i에 num_list에 있는 값 하나씩 대응해서
        for(int i : num_list) {
            sum += i;
            mult *= i;
        }
        //Math.pow -> 특정 값의 제곱 구하기 (sum의 제곱)
        //? -> 맞으면 1 틀리면 0 출력
        answer = Math.pow(sum,2) > mult ? 1 : 0;

        return answer;
    }
}

