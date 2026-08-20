import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int ind = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(c != ' ')
            {
                String str = String.valueOf(c);
                
                if(ind % 2 == 0)
                {
                    answer += str.toUpperCase();
                }
                else
                {
                    answer += str.toLowerCase();
                }
                
                ind++;
            }
            else
            {
                answer += String.valueOf(c);
                ind = 0;
            }
        }
        
        return answer;
    }
}