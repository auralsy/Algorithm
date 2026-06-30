import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        int i = 0;
        
        while(i < arr.length)
        {
            if(stk.isEmpty())
            {
                stk.push(arr[i]);
                i++;
            }
            else
            {
                if(stk.peek() < arr[i])
                {
                    stk.push(arr[i]);
                    i++;
                }
                else if(stk.peek() >= arr[i])
                {
                    stk.pop();
                }
            }
        }
        
        int[] stk1 = new int[stk.size()];
        
        int n = stk.size();
        
        for(int j = n-1; j >= 0; j--)
        {
            stk1[j] = stk.pop();
        }
        
        return stk1;
    }
}