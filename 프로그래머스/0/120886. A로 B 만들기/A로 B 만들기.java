class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] bf = new char[before.length()];
        char[] at = new char[after.length()];
        int count = 0;
        
        for(int i = 0; i < before.length(); i++)
        {
            bf[i] = before.charAt(i);
        }
        
        for(int i = 0; i < after.length(); i++)
        {
            at[i] = after.charAt(i);
        }
        
        for(int i = 0; i < after.length(); i++)
        {
            for(int j = 0; j < before.length(); j++)
            {
                if(at[i] == bf[j])
                {
                    count++;
                    bf[j] = ' ';
                    break;
                }
            }
        }
        
        if(count == after.length())
            answer = 1;
        
        
        return answer;
    }
}