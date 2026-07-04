import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String fi = "";
        
        for(int i = 0; i < arr.length; i++)
        {
            fi += arr[i];
        }
        
        answer = Long.parseLong(fi);
        return answer;
    }
}