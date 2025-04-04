import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //a문자열의 길이만큼 
        for(int i=0; i<a.length(); i++){
            //.charAt() : 한단어씩 끊어서
            System.out.println(a.charAt(i));
        }
        
    }
}