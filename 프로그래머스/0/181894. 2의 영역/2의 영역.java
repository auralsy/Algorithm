class Solution {
    public int[] solution(int[] arr) {
        
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 2)
                count++;
        }
        
        int[] answer;
        
        if(count == 0)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        else if(count == 1)
        {
            answer = new int[1];
            answer[0] = 2;
        }
        else
        {
            int s_ind = 0;
            int e_ind = 0;
            
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == 2)
                {
                    s_ind = i;
                    break;
                }
            }
            
            for(int i = arr.length - 1; i > -1; i--)
            {
                if(arr[i] == 2)
                {
                    e_ind = i;
                    break;
                }
            }
            
            int len = e_ind - s_ind + 1;
            
            answer = new int[len];
            int j = 0;
            
            for(int i = s_ind; i <= e_ind; i++)
            {
                answer[j] = arr[i];
                j++;
            }
        }
        
        return answer;
    }
}