// dungeons[x][0] -> 오직 비교 용도, dungeons[x][1] -> 소모되는 것
// count 변수 -> 탐험한 던전 수 / cur 변수 -> 경우마다 체력 
// 백트래킹

import java.util.*;

class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        bt(k, 0, dungeons, visited);
        
        return answer;
    }
    
    void bt(int cur, int count, int[][] dungeons, boolean[] visited)
    {
        answer = Math.max(answer, count);
        
        for(int i = 0; i < dungeons.length; i++)
        {
            if(!visited[i] && cur >= dungeons[i][0])
            {
                visited[i] = true;
                bt(cur - dungeons[i][1], count + 1, dungeons, visited);
                visited[i] = false;
            }
        }
    }
}