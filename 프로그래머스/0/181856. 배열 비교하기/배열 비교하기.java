//두 배열의 길이가 다르면 배열의 긴길이 긴쪽이 큼
//두 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합 비교 -> 다르다면 더 큰쪽이 크고 같으면 같음
//arr2가 크면 -1 , arr1이 크면 1 , 같으면 0

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        if(arr1.length == arr2.length){
            for(int i = 0; i<arr1.length; i++){
                num1 += arr1[i];
            }
            for(int j = 0; j<arr2.length; j++){
                num2 += arr2[j];
            }
            if(num1 > num2){
                answer = 1;
            }else if(num1 < num2){
                answer = -1;
            }else if(num1 == num2){
                answer = 0;
                
            }
        }else if(arr1.length > arr2.length){
            answer = 1;
            
        }else if(arr1.length < arr2.length){
            answer = -1;
            
        }       
        return answer;
    }
}