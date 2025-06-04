class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int num = i; num<=j; num++){
            str += String.valueOf(num);
        }
        String[] result = str.split("");

        for(int p = 0; p<result.length; p++){
            if(result[p].equals(String.valueOf(k))){
                answer += 1;
            }
        }
        return answer;
    }
}