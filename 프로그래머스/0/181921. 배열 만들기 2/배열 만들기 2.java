import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=l;i<=r;i++){
          //숫자를 문자열로 변경
          String str = String.valueOf(i);
          //문자열의 5와 0 모두 제거(""으로 변경)
          str = str.replace("5","").replace("0","");
          if("".equals(str)){
              //""와 str이 동일하면 list배열에 추가
            list.add(i);
          }
        }
        //list 크기가 0보다 크면 요소 int로 변경, 작으면 list배열에 -1넣기
        return list.size() > 0 ? 
            list.stream().mapToInt(Integer::intValue).toArray() 
            : new int[]{-1};
    }
}

