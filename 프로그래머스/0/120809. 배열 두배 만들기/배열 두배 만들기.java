class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            answer[i] = 2 * numbers[i];
        }
        
        return answer;
    }
}