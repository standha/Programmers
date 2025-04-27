class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        int drink = money/5500; 
        int result = money%5500;
        answer[0] = drink;
        answer[1] = result;
        return answer;
    }
}