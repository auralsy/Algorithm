class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        char c = n_str.charAt(0);
        int ind = 0;
        
        if(c == '0')
        {
            while(ind < n_str.length() && n_str.charAt(ind) == '0')
            {
                
                ind++;
            }
            
            String[] str = n_str.split("");
            
            for(int i = ind; i < n_str.length(); i++)
            {
                answer += str[i];
            }
        }
        else
        {
            answer = n_str;
        }
        
        return answer;
    }
}