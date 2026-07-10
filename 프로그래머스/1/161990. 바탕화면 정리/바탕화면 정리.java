import java.util.*;

// S(세로, 가로), answer = {시작점 가로, 시작점 세로, 끝점 가로, 끝점 세로}
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int min_row = Integer.MAX_VALUE;
        int min_col = Integer.MAX_VALUE;
        int max_row = Integer.MIN_VALUE;
        int max_col = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++)
        {
            for(int j = 0; j < wallpaper[i].length(); j++)
            {
                if(wallpaper[i].charAt(j) == '#')
                {
                    min_row = Math.min(i, min_row);
                    min_col = Math.min(j, min_col);
                    
                    max_row = Math.max(i, max_row);
                    max_col = Math.max(j, max_col);
                }
            }
        }
        
        answer[0] = min_row;
        answer[1] = min_col;
        answer[2] = max_row+1;
        answer[3] = max_col+1;
        
        return answer;
    }
}