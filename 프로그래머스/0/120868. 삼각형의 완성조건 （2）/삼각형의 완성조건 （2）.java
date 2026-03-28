class Solution {
    public int solution(int[] sides) 
    {
        int answer = 0;
        int t = sides[0] + sides[1];
        
        if(sides[0] > sides[1])
        {
            for(int i = 1; i <= sides[0]; i++)
            {
                if(i + sides[1] > sides[0])
                    answer++;
            }
            
            for(int i = sides[0] + 1; i < t; i++)
            {
                answer++;
            }
        }
        else if(sides[0] < sides[1])
        {
            for(int i = 1; i <= sides[1]; i++)
            {
                if(i + sides[0] > sides[1])
                    answer++;
            }
            
            for(int i = sides[1] + 1; i < t; i++)
            {
                answer++;
            }
        }
        else
        {
            for(int i = 1; i < t; i++)
            {
                answer++;
            }
        }
        
        return answer;
    }
}