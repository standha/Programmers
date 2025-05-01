// class Solution {
//     public int[] solution(int[] arr) {
//         int[] answer = {};
//         int k = 0;
//         String str = "";

//         for(int i = 0; i<arr.length; i++){ 
//             str += arr[i];  //문자열로 바꿈
//         }
//         int a = str.indexOf("2");  //처음 2가 나오는 인덱스
//         int b = str.lastIndexOf("2"); //마지막 2가 나오는 인덱스
//         answer = new int[b-a+1];
        
//        if(a == -1 && b == -1){
//             answer[0] = -1;
           
//         }else{  
//             for(int j = a; j <= b; j++){ //처음 2 나오는 인덱스와 마지막 2 나오는 인덱스까지 반복
//                 answer[k]=arr[j]; 
//                 k++;
//             }  
//        }
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> count = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count.add(i);
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        
        if (!count.isEmpty()) {
            for (int i = count.get(0); i <= count.get(count.size() - 1); i++) {
                answer.add(arr[i]);
            }
        } else {
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}