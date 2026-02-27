class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        int a = i;
        char c = (char)(k + '0');
        
        while(a <= j)
        {
            String str = Integer.toString(a);
            
            for(int t = 0; t < str.length(); t++)
            {
                if(str.charAt(t) == c)
                {
                    answer++;
                }
            }
            a++;
        }
        
        return answer;
    }
}