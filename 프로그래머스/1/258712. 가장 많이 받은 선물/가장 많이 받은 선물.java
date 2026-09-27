import java.util.*;
// 선물 준 개수 많은 사람이 하나 받음 / 기록 있을 때
// 선물 지수 : 준 선물 수 - 받은 선물 수 / 기록 없을 때

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        Map<String, Integer> ind = new HashMap<>();
        int[] pScore = new int[len];
        int[][] pGraph = new int[len][len];
        
        for(int i = 0; i < len; i++)
        {
            ind.put(friends[i], i);
        }
        
        for(int i = 0; i < gifts.length; i++)
        {
            String[] arr = gifts[i].split(" ");
            pScore[ind.get(arr[0])]++;
            pScore[ind.get(arr[1])]--;
            pGraph[ind.get(arr[0])][ind.get(arr[1])]++;
        }
        
        for(int i = 0; i < len; i++)
        {
            int num = 0;
            
            for(int j = 0; j < len; j++)
            {
                if(i == j)
                    continue;
                
                if(pGraph[i][j] > pGraph[j][i] || pGraph[i][j] == pGraph[j][i] && pScore[i] > pScore[j])
                    num++;
            }
            if(num > answer)
                answer = num;
        }
        return answer;
    }
}