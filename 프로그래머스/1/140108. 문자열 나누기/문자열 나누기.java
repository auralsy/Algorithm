class Solution {
    public int solution(String s) {
        int answer = 1;
        int same = 1;
        int diff = 0;
        
        char c = s.charAt(0);
        
        for(int i = 1; i < s.length() - 1; i++)
        {
            char c1 = s.charAt(i);
            
            if(c == c1)
            {
                same++;
            }
            else
            {
                diff++;
            }
            
            if(same == diff)
            {
                answer++;
                c = s.charAt(i+1);
            }
        }
        return answer;
    }
}