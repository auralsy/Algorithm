import java.util.*;

class Solution {
    public int solution(int[] array) 
    {
        int answer = 0;
        
        Arrays.sort(array);
        
        int n = array.length;
        
        answer = array[n/2];
        
        return answer;
    }
}