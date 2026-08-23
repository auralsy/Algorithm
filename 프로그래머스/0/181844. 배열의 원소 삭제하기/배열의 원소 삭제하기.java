class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < delete_list.length; j++)
            {
                if(arr[i] == delete_list[j])
                    count++;
            }
        }
        
        int k = arr.length - count;
        int[] answer = new int[k];
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < delete_list.length; j++)
            {
                if(arr[i] == delete_list[j])
                    arr[i] = -1;
            }
        }
        
        int ind = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != -1)
            {
                answer[ind] = arr[i];
                ind++;
            }
        }
        
        return answer;
    }
}