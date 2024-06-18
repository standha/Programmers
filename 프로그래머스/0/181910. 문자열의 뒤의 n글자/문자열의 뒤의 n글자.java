
class Solution {
    //매겨변수 my_string, n
    public String solution(String my_string, int n) {
        String answer = ""; //스트링 받을 answer 선언("")
        int l = my_string.length(); //my_string길이
        answer = my_string.substring(l-n); // l-n부터 끝까지 문자열 리턴
        /*public String substring(int startIndex) -> startIndex부터 끝까지 문자열 리턴
          public String substring(int startIndex, int endIndex) -> startIndex(포함)부터 endIndex(불포함)까지의 문자열을 리턴 */
        return answer;
    }
}