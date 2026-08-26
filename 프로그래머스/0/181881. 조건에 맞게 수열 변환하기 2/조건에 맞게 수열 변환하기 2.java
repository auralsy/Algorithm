class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean check = true;
        int count = 0;
        
        while(true)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if((arr[i] >= 50 && arr[i] % 2 == 0) || (arr[i] < 50 && arr[i] % 2 != 0))
                {
                    check = false;
                    break;
                }
                else
                {
                    check = true;
                }
            }
            
            if(check)
            {
                answer = count;
                break;
            }
            
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] >= 50 && arr[i] % 2 == 0)
                {
                    arr[i] /= 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0)
                {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            count++;
        }
        
        return answer;
    }
}