import java.util.*;

class Solution {
    public String solution(int[] food) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i < food.length; i++)
        {
                for(int j = 0; j < food[i]/2; j++)
                {
                    q.add(i);
                }
        }
        
        
        
        String answer = "";
        int t = q.size();
        String str = "";
        
        for(int i = 0; i < t; i++)
        {
            String s = Integer.toString(q.poll());
            answer += s;
            str += s;
        }
        
        answer += "0";
        
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(str.length()-1-i);
            answer += Character.toString(c);
        }
        
        return answer;
    }
}