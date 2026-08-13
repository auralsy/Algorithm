class Solution {
    String[] vowels = {"A", "E", "I", "O", "U"};
    int answer = 0;
    int count = 0;
    
    public int solution(String word) {
        dfs("", word);
        
        return answer;
    }
    
    // a부터 시작 / e부터 시작 / i부터 시작 ... -> 각 경우마다 처음부터 count 세서 도달
    void dfs(String now, String word)
    {
        if(!now.equals(""))
        {
            count++;
            
            if(now.equals(word))
            {
                answer = count;
                return;
            }
        }
        
        if(now.length() == 5)
            return;
        
        for(int i = 0; i < 5; i++)
        {
            dfs(now + vowels[i], word);
        }
    }
}