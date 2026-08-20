class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        long cNum = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - pLen; i++)
        {
            String str = t.substring(i, i+pLen);
            
            if(str.charAt(0) == '0')
                answer++;
            else
            {
                long n = Long.parseLong(str);
            
                if(cNum >= n)
                    answer++;
            }
        }
        
        return answer;
    }
}