import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = queries.length;
        int min = 0;
        
        for(int i = 0; i < n; i++)
        {
            min = 1000001;
            
            for(int j = queries[i][0]; j <= queries[i][1]; j++)
            {
                if(arr[j] > queries[i][2])
                {
                    if(arr[j] < min)
                        min = arr[j];
                }
            }
            if(min == 1000001)
               list.add(-1); 
            else
                list.add(min);
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}