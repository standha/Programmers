class Solution {
    public int[] solution(int[] array) {
        int[] answer =new int[2];
        int temp = 0;
        int index = 0;
        
    for(int i = 1; i< array.length; i++){
        if(array[i-1]<array[i]){
            temp = array[i];
            index = i;
        }
    }
        answer[0] = temp;
        answer[1] = index;
        
        
        
        
        return answer;
    }
}