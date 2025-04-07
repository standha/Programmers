class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        
        int[] arr={};  //배열 선언 후 초기화
        arr = new int[included.length+1];  //배열 크기->등차수열은 i+1항 부터 시작
        
        for(int i=1; i<arr.length; i++){
            if(i == 1){
                arr[i]=a;
            }else{
                arr[i]=a+(d*(i-1));
            }

        }
        for(int i=1; i<arr.length; i++){
            if(included[i-1]==true){
                sum+=arr[i];
            }
        }
        
        
        return sum;
    }
}