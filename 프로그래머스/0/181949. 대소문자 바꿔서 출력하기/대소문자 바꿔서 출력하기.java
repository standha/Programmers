import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        // 문자열의 길이(str.length()) 만큼 반복
        for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i); //단어 하나씩
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}

