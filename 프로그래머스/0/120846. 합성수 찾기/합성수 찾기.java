class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if(check(i))
                answer++;
        }
        
        return answer;
    }
    
    public boolean check(int a)
    {
        int count = 0;
        
        for(int i = 1; i <= a; i++)
        {
            if(a % i == 0)
                count++;
        }
        
        if(count >= 3)
            return true;
        
        return false;
    }
}