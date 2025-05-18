class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        if(direction.equals("right")){
            for(int i = numbers.length-1; i>0; i--){
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[numbers.length-1]; //첫번째를 numbers의 마지막 원소값을 넣기
        }else if(direction.equals("left")){
            for(int i = 0; i<numbers.length-1; i++){
                answer[i] = numbers[i+1];
            }
            answer[answer.length-1] = numbers[0]; //마지막을 numbers의 첫번쨰 원소값을 넣기
        }
        return answer;
    }
}