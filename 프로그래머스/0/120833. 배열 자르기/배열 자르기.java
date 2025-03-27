class Solution {
    public int[] solution(int[] numbers, int num1, int num2) 
    {   
        int k = num2 - num1 + 1;
        int[] answer = new int[k];
        int t = 0;
        
        for(int j = 0; j < k; j++)
        {
            answer[j] = numbers[j+num1];
        }
        
        return answer;
    }
}