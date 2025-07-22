import java.util.*;
class Solution {
    public String solution(String s) {

        String answer = "";
        ArrayList<Integer> arr = new ArrayList();
        String[] str = s.split(" ");

        for(int i=0; i<str.length; i++) {
        arr.add(Integer.parseInt(str[i])); //배열에 있는 값 하나씩 배열 리스트에 넣어줌
        }
        
        //Collections 사용하면 바로 최대 최소 구할 수 있다
        answer = "" + Collections.min(arr) + " " + Collections.max(arr); 
        
        return answer;
    }
}