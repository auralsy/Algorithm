class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int mid = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            mid += numbers[i];
        }
        
        answer = 45 - mid;
        
        return answer;
    }
}