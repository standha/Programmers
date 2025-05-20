import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        for(String key : map.keySet()){
            String value = String.valueOf(map.get(key));
            numbers = numbers.replace(key,value);
            
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}