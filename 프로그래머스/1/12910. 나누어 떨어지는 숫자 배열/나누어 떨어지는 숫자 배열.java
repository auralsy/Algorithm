import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%divisor == 0)
                count++;
        }
        
        int[] answer;
        
        if(count == 0)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        else
        {
            answer = new int[count];
            int ind = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i]%divisor == 0)
                {
                    answer[ind] = arr[i];
                    ind++;
                }
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}