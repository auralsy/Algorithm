import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            if(stk.isEmpty())
            {
                stk.push(arr[i]);
            }
            
            if(stk.peek() != arr[i])
                stk.push(arr[i]);
        }
        
        int sz = stk.size();
        int[] answer = new int[sz];
        
        for(int i = sz-1; i >= 0; i--)
        {
            answer[i] = stk.pop();
        }
        
        return answer;
    }
}