class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long n = num;
        
        while(n != 1)
        {
            if(n == 1)
            {
                count = 0;
                break;
            }
            
            if(n % 2 == 0)
            {
                n /= 2;
                count++;
            }
            else
            {
                n = n * 3 + 1;
                count++;
            }
            
            
            if(count == 500 && n != 1)
            {
                count = -1;
                break;
            }
                
        }
        
        answer = count;
        
        return answer;
    }
}