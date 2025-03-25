class Solution {
    public int solution(int n) 
    {
        int answer = 0;
        if(n % 2 == 0)
            answer = n*(n+1)/2 - (n/2)*(n/2);
        else
        {
            answer = n*(n+1)/2 - ((n/2)+1)*((n/2)+1);
        }
        
        return answer;
    }
}