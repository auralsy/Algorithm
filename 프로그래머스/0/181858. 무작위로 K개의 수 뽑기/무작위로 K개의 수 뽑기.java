class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        answer[0] = arr[0];
        int j = 1;
        int count = 1;
        
        
        for(int i = 1; i < arr.length; i++)
        {
            boolean check = false;
            
            for(int t = 0; t < answer.length; t++)
            {
                if(arr[i] == answer[t])
                    check = true;
            }
            
            if(!check)
            {
                answer[j] = arr[i];
                j++;
                count++;
            }
            
            if(count == k)
                break;
            else
            {
                for(int m = j; m < answer.length; m++)
                {
                    answer[m] = -1;
                }
            }
        }
        
        
        
        return answer;
    }
}