class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer3 = (numer1*denom2) + (numer2*denom1);
        int denom3 = denom1*denom2;
        int max = 0;
        
        if(numer3 > denom3)
        {
            for(int i = 1; i <= denom3; i++)
            {
                if((numer3%i == 0)&&(denom3%i == 0))
                {
                    max = i;
                }
            }
            answer[0] = numer3/max;
            answer[1] = denom3/max;
        }
        else if(numer3 == denom3)
        {
            answer[0] = 1;
            answer[1] = 1;
        }
        else
        {
            for(int i = 1; i <= numer3; i++)
            {
                if((numer3%i == 0)&&(denom3%i == 0))
                {
                    max = i;
                }
            }
            answer[0] = numer3/max;
            answer[1] = denom3/max;
        }
        
        return answer;
    }
    
}