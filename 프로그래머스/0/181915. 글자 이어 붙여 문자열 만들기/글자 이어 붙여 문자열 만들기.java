
class Solution {
    public String solution(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            //append->인수로 전달된 값을 문자열로 변환한 후 해당 문자열의 마지막에 추가한다(이어붙이기)
            //charAt-> String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해줌
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }
}