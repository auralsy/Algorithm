class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0)
        {
            char c1 = s.charAt(s.length()/2 - 1);
            char c2 = s.charAt(s.length()/2);
            
            answer += (String.valueOf(c1));
            answer += (String.valueOf(c2));
        }
        else
        {
            char c3 = s.charAt(s.length()/2);
            answer += (String.valueOf(c3));
        }
        
        return answer;
    }
}