import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int min = 100;
        
        for(int i = 0; i < array.length; i++)
        {
            int test = Math.abs(n-array[i]);
            
            if(test < min)
            {
                min = test;
                answer = array[i];
            }
        }
        
        return answer;
    }
}