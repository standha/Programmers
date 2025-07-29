class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target){
        dfs(numbers, 0, target, 0);
        return answer;
    }
        
    private void dfs(int[] numbers, int depth, int target, int num){
        if(depth == numbers.length){
            if(num == target){
                answer++;
            }

            return;
        }else{
            dfs(numbers, depth + 1, target, num + numbers[depth]);
            dfs(numbers, depth + 1, target, num - numbers[depth]);
        }
    }
}