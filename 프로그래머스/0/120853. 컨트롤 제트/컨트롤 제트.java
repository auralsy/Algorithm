// 스택 사용, tokenizer 대신 split 사용

import java.util.*;
import java.io.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<String> stack = new Stack<>();
        
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i++)
        {   
            if(str[i].equals("Z"))
            {
                stack.pop();
            }
            else
            {
                stack.push(str[i]);
            }
        }
        
        while(!stack.isEmpty())
        {
            answer += Integer.parseInt(stack.pop());
        }
        
        return answer;
    }
}