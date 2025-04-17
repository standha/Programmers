import java.util.*;
class Solution {
    public int[] solution(int n) {

        ArrayList <Integer> arr = new ArrayList <> (); //가변배열할당
        arr.add(n); //처음 n을 arr 배열에 추가
        //1이 아닐때까지 반복하면서 arr배열에 추가
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            } else if(n % 2 != 0){
                n = (3 * n + 1);
            }
            arr.add(n);
        }
        //answer 배열을 arr배열 크기만큼 할당 후 for문 돌리면서 
        //arr배열에 있는 값 가져와서 anwer 배열에 넣어줌
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i ++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}