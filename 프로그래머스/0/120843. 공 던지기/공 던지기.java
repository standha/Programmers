class Solution {
    public int solution(int[] numbers, int k) {
        //처음 던지는 사람은 인덱스가 0번
        //하나 건너뛰기 때문에 *2
        //k가 인덱스 길이보다 길면 반복하기 때문에 배열의 길이로 나눠서 나머지값인 인덱스 번호
         return numbers[2 * (k - 1) % numbers.length];
    }
}