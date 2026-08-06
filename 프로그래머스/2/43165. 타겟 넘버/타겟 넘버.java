class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        bt(0, 0, numbers, target);
        return answer;
    }
    
    void bt(int index, int sum, int[] numbers, int target)
    {
        if(index == numbers.length)
        {
            if(sum == target)
                answer++;
            return;
        }
        
        bt(index+1, sum+numbers[index], numbers, target);
        bt(index+1, sum-numbers[index], numbers, target);
    }
}