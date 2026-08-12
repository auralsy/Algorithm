class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] answer;
        
        
        for(int i = 1; ; i = i*2)
        {
            if(len > i)
            {
                continue;
            }
            else if(len == i)
            {
                answer = new int[len];
                
                for(int j = 0; j < len; j++)
                {
                    answer[j] = arr[j];
                }
                
                break;
            }
            else
            {
                int sub = i - len;
                
                answer = new int[len + sub];
                
                for(int j = 0; j < len; j++)
                {
                    answer[j] = arr[j];
                }
                
                for(int j = len; j < len+sub; j++)
                {
                    answer[j] = 0;
                }
                
                break;
            }
        }
        
        return answer;
    }
}