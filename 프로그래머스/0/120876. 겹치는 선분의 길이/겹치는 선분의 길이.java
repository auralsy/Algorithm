// 안 겹치는 경우, 일부 겹치는 경우, 하나가 포함되는 경우
// 시작점 : lines[0][0], lines[1][0], lines[2][0]
// 끝 점 : lines[0][1], lines[1][1], lines[2][1]
class Solution {
    public int solution(int[][] lines) {
        int[] road = new int[200];
        
        for (int[] line : lines) 
        {
            int start = line[0] + 100; 
            int end = line[1] + 100;
            
            for (int i = start; i < end; i++) 
            {
                road[i]++;
            }
        }
        
        int answer = 0;
        
        for (int i = 0; i < road.length; i++) 
        {
            if (road[i] >= 2) 
            {
                answer++;
            }
        }
        
        return answer;
    }
}