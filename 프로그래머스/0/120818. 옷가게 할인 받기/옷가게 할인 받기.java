class Solution {
    public int solution(int price) {
        int answer = 0;
        if(100000<=price && price<300000){
            answer = (int)(price - (price*0.05));
        }else if(300000<=price && price<500000){
            answer = (int)(price - (price*0.1));
        }else if(price>=500000){
            answer = (int)(price - (price*0.2));
        }else if(price<100000){
            answer = price;
        }
        return answer;
    }
}