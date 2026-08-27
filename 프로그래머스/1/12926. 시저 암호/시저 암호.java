class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(c == ' ')
            {
                answer += " ";
                continue;
            }
            else
            {
                for(int j = 0; j < n; j++)
            {
                if(c == 'z')
                {
                    c = 'a';
                    continue;
                }
                else if(c == 'Z')
                {
                    c = 'A';
                    continue;
                }
                
                c = (char)(c + 1);
            }
            }
            
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}