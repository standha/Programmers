class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        String k1 = String.valueOf(k);
        if(str.contains(k1)){
            for(int i = 0; i<str.length(); i++){
                if(String.valueOf(str.charAt(i)).equals(k1)){
                    answer = i+1;
                    break;
                }
            }
        }else{
            answer = -1;
        }
        return answer;
    }
}