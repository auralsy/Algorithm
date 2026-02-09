class Solution {
    public int solution(int[] numbers) {
        // 음수 곱, 양수 곱 구분
        int answer = 0;
        
        int max = -100000000;
        
        for(int i = 0; i < (numbers.length - 1); i++)
        {
            for(int j = (i+1); j < numbers.length; j++)
            {
                int b = numbers[i] * numbers[j];
                
                if(b > max)
                    max = b;
            }
        }
        
        answer = max;
        
        return answer;
    }
}