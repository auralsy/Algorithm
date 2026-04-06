import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int k = numlist.length;
        int[] answer = new int[k];
        
        Integer[] arr = new Integer[numlist.length];
        
        for(int i = 0; i < numlist.length; i++)
        {
            arr[i] = numlist[i];
        }
        
        Arrays.sort(arr, (a,b) -> {
            int distA = Math.abs(n-a);
            int distB = Math.abs(n-b);
            
            if(distA == distB)
                return b - a;
            
            return distA - distB;
        });
        
        for(int i = 0; i < numlist.length; i++)
        {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}