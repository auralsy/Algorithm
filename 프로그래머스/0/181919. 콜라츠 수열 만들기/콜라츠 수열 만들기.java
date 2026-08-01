class Solution {
    public int[] solution(int n) {
        int count = 1;
        int test = n;
        
        while(test != 1)
        {
            if(test % 2 == 0)
            {
                test /= 2;
                count++;
            }
            else
            {
                test = test * 3 + 1;
                count++;
            }
        }
        
        int[] answer = new int[count];
        answer[0] = n;
        
        for(int i = 1; i < count; i++)
        {
            if(n % 2 == 0)
            {
                n = n/2;
                answer[i] = n;
            }
            else
            {
                n = n*3 + 1;
                answer[i] = n;
            }
        }
        
        return answer;
    }
}