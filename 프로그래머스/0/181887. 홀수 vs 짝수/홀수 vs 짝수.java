class Solution {
    public int solution(int[] num_list) 
    {
        int answer = 0;
        int length = num_list.length;
        int odd = 0;
        int even = 0;
        
        for(int i = 0; i < length; i++)
        {
            if(i%2 == 0)
            {
                odd += num_list[i];
            }
            else
            {
                even += num_list[i];
            }
        }
        
        if(odd >= even)
            answer = odd;
        else
            answer = even;
        
        return answer;
    }
}