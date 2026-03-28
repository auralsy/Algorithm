class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int mid_answer = 1;
        
        for(int i = 1; i <= 10; i++)
        {
            mid_answer *= i;
            
            if(mid_answer == n)
            {
                answer = i;
                break;
            }
            
            if(mid_answer*(i+1) > n && mid_answer < n)
            {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}