class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int target = (2*(k-1)) % numbers.length;
        
        answer = numbers[target];
        
        return answer;
    }
}