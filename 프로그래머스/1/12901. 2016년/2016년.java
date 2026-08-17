import java.util.*;

class Solution {
    public String solution(int a, int b) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        
        hm.put(1, 31);
        hm.put(2,29);
        hm.put(3,31);
        hm.put(4, 30);
        hm.put(5, 31);
        hm.put(6,30);
        hm.put(7, 31);
        hm.put(8, 31);
        hm.put(9, 30);
        hm.put(10, 31);
        hm.put(11, 30);
        hm.put(12, 31);
        
        if(a == 1)
        {
            count += b;
        }
        else
        {
            for(int i = 1; i < a; i++)
            {
                count += hm.get(i);
            }
            
            count += b;
        }
        
        String answer = "";
        int remain = (count-1) % 7;
        
        if(remain == 0)
            answer = "FRI";
        else if(remain == 1)
            answer = "SAT";
        else if(remain == 2)
            answer = "SUN";
        else if(remain == 3)
            answer = "MON";
        else if(remain == 4)
            answer = "TUE";
        else if(remain == 5)
            answer = "WED";
        else if(remain == 6)
            answer = "THU";
        
        return answer;
    }
}