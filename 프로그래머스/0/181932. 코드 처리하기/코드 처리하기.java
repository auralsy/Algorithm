class Solution {
    public String solution(String code) {
        String answer = "";
        String mode = "0";
        
        for(int i = 0; i < code.length(); i++)
        {
            char c = code.charAt(i);
            String str = Character.toString(c);
            
            if(str.equals("1"))
            {
                if(mode.equals("0"))
                {
                    mode = "1";
                }
                else
                {
                    mode = "0";
                }
                
                continue;
            }
            
            if(mode.equals("1"))
            {
                if(i % 2 != 0)
                {
                    answer += str;
                }
            }
            else
            {
                if(i % 2 == 0)
                {
                    answer += str;
                }
            }
        }
        
        if(answer == "")
            answer = "EMPTY";
        return answer;
    }
}