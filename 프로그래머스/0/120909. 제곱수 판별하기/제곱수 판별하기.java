class Solution {
    public int solution(int n) 
    {
        int answer = 2;
        
        if(n == 1)
            answer = 1;
        else
        {
            for(int i = 2; i <= 1000; i++)
            {
                if(n == i*i)
                    answer = 1;
            }
        }
        return answer;
    }
}