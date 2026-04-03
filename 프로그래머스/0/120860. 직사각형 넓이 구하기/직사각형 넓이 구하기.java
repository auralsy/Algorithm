class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int max = -256;
        int min = 256;
        
        for(int i = 0; i < 4; i++)
        {
            if(dots[i][0] > max)
                max = dots[i][0];
            
            if(dots[i][0] < min)
                min = dots[i][0];
        }
        
        int width = max - min;
        
        max = -256;
        min = 256;
        
        for(int i = 0; i < 4; i++)
        {
            if(dots[i][1] > max)
                max = dots[i][1];
            
            if(dots[i][1] < min)
                min = dots[i][1];
        }
        
        int height = max - min;
        
        answer = width * height;
        
        return answer;
    }
}