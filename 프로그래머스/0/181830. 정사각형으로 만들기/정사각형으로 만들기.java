class Solution {
    public int[][] solution(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        
        int[][] answer;
        
        if(r > c)
        {
            answer = new int[r][r];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        else if(r < c)
        {
            answer = new int[c][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    answer[i][j] = arr[i][j];
                }
            }
            
        }
        else
        {
            answer = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}