class Solution {
    public int solution(int n) 
    {
        int answer = 0;
        
        int sum = 0;
        int i = n;
        
        if(n % 2 != 0)
        {
            while(true)
            {
                if(i <= 0)
                    break;
                else
                {
                    sum += i;
                    i -= 2;
                }
            }
        }
        else
        {
            while(true)
            {
                if(i <= 0)
                    break;
                else
                {
                    sum += i*i;
                    i -= 2;
                }
            }
        }
        
        
        answer = sum;
        
        return answer;
    }
}