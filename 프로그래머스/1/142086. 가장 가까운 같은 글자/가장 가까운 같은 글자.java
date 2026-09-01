class Solution {
    public int[] solution(String s) {
        boolean[] visited = new boolean[26];
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(!visited[c-'a'])
            {
                answer[i] = -1;
            }
            else
            {
                for(int j = (i-1); j >= 0; j--)
                {
                    char c1 = s.charAt(j);
                    
                    if(c == c1)
                    {
                        answer[i] = i-j;
                        break;
                    }
                }
            }
            
            visited[c - 'a'] = true;
        }
        
        return answer;
    }
}