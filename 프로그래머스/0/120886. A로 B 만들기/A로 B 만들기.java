import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] b = before.toCharArray(); //문자 하나씩 배열에 담음
        char[] a = after.toCharArray();

        Arrays.sort(b);
        Arrays.sort(a);

        return Arrays.equals(b, a) ? 1 : 0; // 하나씩 비교
    }
}