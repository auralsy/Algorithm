class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        
        for(int i = 0; i < len-2; i++)
        {
            for(int j = i+1; j < len-1; j++)
            {
                for(int t = j+1; t < len; t++)
                {
                    int k = nums[i] + nums[j] + nums[t];
                    
                    if(prime(k))
                        answer++;
                }
            }
        }
        
        return answer;
    }
    
    boolean prime(int n)
    {
        int count = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                count++;
        }
        
        if(count == 2)
            return true;
        
        return false;
    }
}