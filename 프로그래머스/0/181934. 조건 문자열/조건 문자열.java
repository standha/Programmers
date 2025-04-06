class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<")){
            if(eq.equals("=")){
                return n <= m ? 1 : 0;
            }else if(eq.equals("!")){
                return n < m ? 1 : 0;
            }
        }else if(ineq.equals(">")){
            if(eq.equals("=")){
                return n >= m ? 1 : 0;
            }else if(eq.equals("!")){
                return n > m ? 1 : 0;
            }
        }
        
        //조건에 맞지 않는 경우 기본적으로 0
        return 0;
    }
}