class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] arr = new int[number+1];
        
        for(int i = 1; i <= number; i++)
        {
            int count = 0;
            
            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0)
                    count++;
            }
            
            if(count > limit)
                arr[i] = power;
            else
                arr[i] = count;
        }
        
        for(int i = 0; i <= number; i++)
            answer += arr[i];
        
        return answer;
    }
}