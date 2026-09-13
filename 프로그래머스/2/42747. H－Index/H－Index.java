import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        int max = 0;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < n; i++)
        {
            int count = 0;
            
            if(citations[i] >= n - i)
                count = n-i;
            
            if(max < count)
                max = count;
        }
        
        answer = max;
        
        return answer;
    }
}