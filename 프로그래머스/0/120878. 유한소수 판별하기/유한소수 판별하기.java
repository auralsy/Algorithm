class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int gcd = getGCD(a, b);
        
        b /= gcd;
        
        while(b % 2 == 0)
        {
            b /= 2;
        }
        
        while(b % 5 == 0)
        {
            b /= 5;
        }
        
        if(b == 1)
            answer = 1;
        else
            answer = 2;
        
        
        return answer;
    }
    
    public int getGCD(int n1, int n2)
{
    if(n1 % n2 == 0)
    {
        return n2;
    }
    else
        return getGCD(n2, n1%n2);
}
}

