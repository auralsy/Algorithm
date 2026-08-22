class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;
        
        for(int p : section)
        {
            if(p > last)
            {
                answer++;
                last = p + m - 1;
            }
        }
            
        return answer;
    }
}