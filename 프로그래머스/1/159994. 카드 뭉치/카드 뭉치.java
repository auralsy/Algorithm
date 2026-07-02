import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> stk1 = new Stack<>();
        Stack<String> stk2 = new Stack<>();
        
        String answer = "No";
        
        for(int i = cards1.length-1; i >= 0; i--)
        {
            stk1.push(cards1[i]);
        }
        
        for(int i = cards2.length-1; i >= 0; i--)
        {
            stk2.push(cards2[i]);
        }
        
        int count = 0;
        
        for(int i = 0; i < goal.length; i++)
        {
            if(!stk1.isEmpty() && goal[i].equals(stk1.peek()))
            {
                stk1.pop();
            }
            else if(!stk2.isEmpty() && goal[i].equals(stk2.peek()))
            {
                stk2.pop();
            }
            else
            {
                answer = "No";
                break;
            }
            
            count++;
        }
        
        if(count == goal.length)
            answer = "Yes";
        
        return answer;
    }
}