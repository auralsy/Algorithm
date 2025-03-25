class Solution {
    public int solution(int[] sides) 
    {
        int answer = 0;
        
        int max = sides[0];
        
        if(sides[1] > max)
            max = sides[1];
        if(sides[2] > max)
            max = sides[2];
        
        if(max == sides[0])
        {
            if(max < sides[1]+sides[2])
                answer = 1;
            else
                answer = 2;
        }
        else if(max == sides[1])
        {
            if(max < sides[0]+sides[2])
                answer = 1;
            else
                answer = 2;
        }
        else if(max == sides[2])
        {
            if(max < sides[1]+sides[0])
                answer = 1;
            else
                answer = 2;
        }
        return answer;
    }
}