import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        int i = 0;
        
        while(i < arr.length)
        {
            if(stk.size() == 0)
            {
                stk.push(arr[i]);
                i++;
            }
            else
            {
                if(stk.peek() == arr[i])
                {
                    stk.pop();
                    i++;
                }
                else if(stk.peek() != arr[i])
                {
                    stk.push(arr[i]);
                    i++;
                }
            }
        }
        
        int n = stk.size();
        int[] answer;
        
        if(n == 0)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        else
        {
            answer = new int[n];
            
            for(int j = n-1; j >= 0; j--)
        {
            answer[j] = stk.pop();
        }
        }
        
        
        
            return answer;
    }
}