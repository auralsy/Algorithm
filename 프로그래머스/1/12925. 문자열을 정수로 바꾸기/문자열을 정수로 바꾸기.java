class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        
        char c = s.charAt(0);
        
        if(c == '+')
        {
            for(int i = 1; i < s.length(); i++)
            {
                char c1 = s.charAt(i);
                
                str += String.valueOf(c1);
            }
            
            answer = Integer.parseInt(str);
        }
        else if(c == '-')
        {
            for(int i = 1; i < s.length(); i++)
            {
                char c2 = s.charAt(i);
                
                str += String.valueOf(c2);
            }
            
            answer = Integer.parseInt(str);
            answer = answer * -1;
        }
        else
        {
            for(int i = 0; i < s.length(); i++)
            {
                char c1 = s.charAt(i);
                
                str += String.valueOf(c1);
            }
            
            answer = Integer.parseInt(str);
        }
        
        return answer;
    }
}