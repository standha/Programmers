class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while (coupon >= 10){
            int newcoupon = coupon / 10;
            answer += newcoupon; //서비스 치킨 수
            coupon = coupon%10 + newcoupon;  // 남은 쿠폰 + 서비스 치킨으로 생긴 쿠폰
        }

        return answer;
    }
}